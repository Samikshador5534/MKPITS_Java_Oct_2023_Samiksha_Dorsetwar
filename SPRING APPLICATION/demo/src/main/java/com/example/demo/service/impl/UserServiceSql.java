package com.example.demo.service.impl;

import com.example.demo.dto.request.UserRequestDto;

import com.example.demo.dto.response.UserGetResponseDto;
import com.example.demo.dto.response.UserPostResponseDto;
import com.example.demo.mysql.model.UserCredential;
import com.example.demo.mysql.model.UserModel;
import com.example.demo.repository.UserCredentialRepository;
import com.example.demo.repository.Userrepository;
import com.example.demo.service.IUserSql;
import com.google.common.hash.Hashing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceSql implements IUserSql {

    @Autowired
    Userrepository userrepository;

    @Autowired
    UserCredentialRepository userCredentialRepository;


    @Override
    public UserRequestDto getUserById(Integer id) {

        Optional<UserModel> userModel = userrepository.findById(id);
        UserRequestDto userDtoSql = new UserRequestDto();
        if (userModel.isPresent()){
            userDtoSql = convertUserModelToUserDtoSql(userModel.get());
        }
        return userDtoSql;
    }

    @Override
    public List<UserGetResponseDto> getAllUsers() {

        List<UserModel> userModelList = (List<UserModel>) userrepository.findAll();
//        List<UserRequestSql> userDtoList = new ArrayList<>();
//        for(UserModel userModel: userModelList){
//            UserRequestSql userRequestSql = convertUserModelToUserDtoSql(userModel);
//            userDtoList.add(userRequestSql);
//        }
        List<UserGetResponseDto> userGetResponseDtoList = new ArrayList<>();
        for (UserModel userModel : userModelList) {
            UserGetResponseDto userGetResponseDto = convertUserModelToUserGetResponseSql(userModel);
            userGetResponseDtoList.add(userGetResponseDto);
        }
        return userGetResponseDtoList;
    }



    @Override
    public UserRequestDto updateUser(UserRequestDto userRequestDto) {
        Optional<UserModel> userModelOptional = userrepository.findById(userRequestDto.getId());
        if(userModelOptional.isEmpty()) {
            System.out.println("User data with id: " + userRequestDto.getId() + " not found");
        } else {
            UserModel userModel = convertUserDtoToUserModel(userRequestDto, userModelOptional.get());
            userModel.setId(userRequestDto.getId());
            userModel = userrepository.save(userModel);
            return convertUserModelToUserDtoSql(userModel);
        }
        return userRequestDto;
    }


    @Override
    public UserRequestDto deleteUser(Integer id) {
        Optional<UserModel> userModelOptional = userrepository.findById(id);
        if (userModelOptional.isEmpty()) {
            System.out.println("User data with id: " + id + " not found");
            return  null;
        } else {
            userrepository.deleteById(id);
            System.out.println("User data with id: " + id + " deleted successfully");
            return  convertUserModelToUserDtoSql(userModelOptional.get());
        }
    }

    @Override
    public UserRequestDto updatePartialUser(UserRequestDto userRequestDto) {
        Optional<UserModel> userModelOptional = userrepository.findById(userRequestDto.getId());
        if (userModelOptional.isEmpty()) {
            System.out.println("User data with id: " + userRequestDto.getId() + " not found");
            return  null;
        } else {
            UserModel userModel = userModelOptional.get();
           // UserModel userModel = userModelOptional.get();
            userModel.setFirstName(userRequestDto.getFirstName() != null && !userRequestDto.getFirstName().equals(userModel.getFirstName()) ? userRequestDto.getFirstName() : userModel.getFirstName());
            userModel.setLastName(userRequestDto.getLastName() != null && !userRequestDto.getLastName().equals(userModel.getLastName()) ? userRequestDto.getLastName() : userModel.getLastName());
            userModel.setEmail(userRequestDto.getEmail() != null && !userRequestDto.getEmail().equals(userModel.getEmail()) ? userRequestDto.getEmail() :userModel.getEmail());
            userModel.setMobile(userRequestDto.getMobile() != null && !userRequestDto.getMobile().equals(userModel.getMobile()) ? userRequestDto.getMobile() :userModel.getMobile());
            userModel.setMobile(((userRequestDto.getDateOfBirth() != null) && !userRequestDto.getDateOfBirth().equals(userModel.getDateOfBirth())) ? String.valueOf(userRequestDto.getDateOfBirth()) : String.valueOf(userModel.getDateOfBirth()));
            userModel.setUpdatedBy(2);
            userModel.setUpdatedAt(LocalDateTime.now());
            userrepository.save(userModel);
            return  convertUserModelToUserDtoSql(userModel);
        }
    }


    @Override
    @Transactional
    public UserPostResponseDto createUser(UserRequestDto userDto) {

        // Below code saves data in users table
        UserModel userModel = new UserModel();
        userModel = convertUserDtoToUserModel(userDto, userModel);
        userModel.setCreatedBy(1);
        userModel.setCreatedAt(LocalDateTime.now());
        userModel = userrepository.save(userModel);

        // Below code saves data in user_credentials table
        UserCredential userCredential = new UserCredential();
        String uuid = UUID.randomUUID().toString();
        System.out.println("UUID: " + uuid);
        final String computedPassword = Hashing.sha256()
                .hashString(userDto.getPassword(), StandardCharsets.UTF_8).toString() + uuid;
        userCredential.setUserId(userModel.getId());
        userCredential.setUsername(userDto.getUsername());
        userCredential.setPassword(computedPassword);
        userCredential.setPasswordSalt(uuid);
        userCredential.setLoginDateTime(LocalDateTime.now());
        userCredential.setCreatedBy(1);
        userCredential.setCreatedAt(LocalDateTime.now());
        userCredential.setUpdatedBy(1);
        userCredential.setUpdatedAt(LocalDateTime.now());
        userCredentialRepository.save(userCredential);
        //return convertUserModelToUserDtoSql(userModel);
        UserPostResponseDto userPostResponseDto = new UserPostResponseDto();
        userPostResponseDto.setId(userModel.getId());
        userPostResponseDto.setFirstName(userModel.getFirstName());
        userPostResponseDto.setUsername(userCredential.getUsername());
        return userPostResponseDto;
    }


    private UserRequestDto convertUserModelToUserDtoSql(UserModel userModel) {
        UserRequestDto userDtoSql= new UserRequestDto();
        userDtoSql.setId(userModel.getId());
        userDtoSql.setFirstName(userModel.getFirstName());
        userDtoSql.setLastName(userModel.getLastName());
        userDtoSql.setMobile(userModel.getMobile());
        userDtoSql.setEmail(userModel.getEmail());
        return  userDtoSql;

//        UserRequestSql userRequestSql = UserRequestSql.builder()
//                .id(userModel.getId())
//                .firstName(userModel.getFirstName())
//                .lastName(userModel.getLastName())
//                .mobile(userModel.getMobile())
//                .email(userModel.getEmail())
//                .dateOfBirth(LocalDate.from(userModel.getDateOfBirth()))
//                .build();
//        return userRequestSql ;

    }

//    private UserModel convertUserDtoToUserModel(UserSql userDtoSql) {
//        UserModel userModel = new UserModel();
//        userModel.setUsername(userDtoSql.getUsername());
//        userModel.setFirstName(userDtoSql.getFirstName());
//        userModel.setLastName(userDtoSql.getLastName());
//        userModel.setMobile(userDtoSql.getMobile());
//        userModel.setEmail(userDtoSql.getEmail());
//        userModel.setCreatedBy(1);
//        userModel.setCreatedAt(LocalDateTime.now());
//        userModel.setUpdatedBy(1);
//        userModel.setUpdatedAt(LocalDateTime.now());
//        return userModel;
//    }
    private UserModel convertUserDtoToUserModel(UserRequestDto userRequestDto, UserModel userModel) {
//        userModel.setFirstName(userRequestSql.getFirstName());
//        userModel.setLastName(userRequestSql.getLastName());
//        userModel.setMobile(userRequestSql.getMobile());
//        userModel.setEmail(userRequestSql.getEmail());
//        userModel.setUpdatedBy(1);
//        userModel.setUpdatedAt(LocalDateTime.now());
//        return userModel;

        userModel = UserModel.builder()
                .firstName(userRequestDto.getFirstName())
                .lastName(userRequestDto.getLastName())
                .mobile(userRequestDto.getMobile())
                .email(userRequestDto.getEmail())
                .dateOfBirth(userRequestDto.getDateOfBirth().atStartOfDay())
                .createdAt(LocalDateTime.now())
                .updatedBy(1)
                .updatedAt(LocalDateTime.now())
                .build();

        return  userModel;
    }

    private UserGetResponseDto convertUserModelToUserGetResponseSql(UserModel userModel) {

        UserGetResponseDto userGetResponseDto = new UserGetResponseDto();
        userGetResponseDto.setId(userModel.getId());
        userGetResponseDto.setFirstName(userModel.getFirstName());
        userGetResponseDto.setLastName(userModel.getLastName());
        userGetResponseDto.setMobile(userModel.getMobile());
        userGetResponseDto.setEmail(userModel.getEmail());
        return userGetResponseDto;
    }

}
