package com.example.demo.service.impl;

import com.example.demo.dto.request.UserRequestSql;

import com.example.demo.dto.response.UserResponseSql;
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
import java.time.LocalDate;
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
    public UserRequestSql getUserById(Integer id) {

        Optional<UserModel> userModel = userrepository.findById(id);
        UserRequestSql userDtoSql = new UserRequestSql();
        if (userModel.isPresent()){
            userDtoSql = convertUserModelToUserDtoSql(userModel.get());
        }
        return userDtoSql;
    }

    @Override
    public List<UserRequestSql> getAllUsers() {

        List<UserModel> userModelList = (List<UserModel>) userrepository.findAll();
        List<UserRequestSql> userDtoList = new ArrayList<>();
        for(UserModel userModel: userModelList){
            UserRequestSql userRequestSql = convertUserModelToUserDtoSql(userModel);
            userDtoList.add(userRequestSql);
        }
        return userDtoList;
    }

    @Override
    public UserRequestSql updateUser(UserRequestSql userRequestSql) {
        Optional<UserModel> userModelOptional = userrepository.findById(userRequestSql.getId());
        if(userModelOptional.isEmpty()) {
            System.out.println("User data with id: " + userRequestSql.getId() + " not found");
        } else {
            UserModel userModel = convertUserDtoToUserModel(userRequestSql, userModelOptional.get());
            userModel.setId(userRequestSql.getId());
            userModel = userrepository.save(userModel);
            return convertUserModelToUserDtoSql(userModel);
        }
        return userRequestSql;
    }


    @Override
    public UserRequestSql deleteUser(Integer id) {
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
    public UserRequestSql updatePartialUser(UserRequestSql userRequestSql) {
        Optional<UserModel> userModelOptional = userrepository.findById(userRequestSql.getId());
        if (userModelOptional.isEmpty()) {
            System.out.println("User data with id: " + userRequestSql.getId() + " not found");
            return  null;
        } else {
            UserModel userModel = userModelOptional.get();
           // UserModel userModel = userModelOptional.get();
            userModel.setFirstName(userRequestSql.getFirstName() != null && !userRequestSql.getFirstName().equals(userModel.getFirstName()) ? userRequestSql.getFirstName() : userModel.getFirstName());
            userModel.setLastName(userRequestSql.getLastName() != null && !userRequestSql.getLastName().equals(userModel.getLastName()) ? userRequestSql.getLastName() : userModel.getLastName());
            userModel.setEmail(userRequestSql.getEmail() != null && !userRequestSql.getEmail().equals(userModel.getEmail()) ? userRequestSql.getEmail() :userModel.getEmail());
            userModel.setMobile(userRequestSql.getMobile() != null && !userRequestSql.getMobile().equals(userModel.getMobile()) ? userRequestSql.getMobile() :userModel.getMobile());
            userModel.setMobile(((userRequestSql.getDateOfBirth() != null) && !userRequestSql.getDateOfBirth().equals(userModel.getDateOfBirth())) ? String.valueOf(userRequestSql.getDateOfBirth()) : String.valueOf(userModel.getDateOfBirth()));
            userModel.setUpdatedBy(2);
            userModel.setUpdatedAt(LocalDateTime.now());
            userrepository.save(userModel);
            return  convertUserModelToUserDtoSql(userModel);
        }
    }


    @Override
    @Transactional
    public UserResponseSql createUser(UserRequestSql userDto) {

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
        UserResponseSql userResponseSql = new UserResponseSql();
        userResponseSql.setId(userModel.getId());
        userResponseSql.setFirstName(userModel.getFirstName());
        userResponseSql.setUsername(userCredential.getUsername());
        return userResponseSql;
    }


    private UserRequestSql convertUserModelToUserDtoSql(UserModel userModel) {
//        UserRequestSql userDtoSql= new UserRequestSql();
//        userDtoSql.setId(userModel.getId());
//        userDtoSql.setFirstName(userModel.getFirstName());
//        userDtoSql.setLastName(userModel.getLastName());
//        userDtoSql.setMobile(userModel.getMobile());
//        userDtoSql.setEmail(userModel.getEmail());
//        return  userDtoSql;

        UserRequestSql userRequestSql = UserRequestSql.builder()
                .id(userModel.getId())
                .firstName(userModel.getFirstName())
                .lastName(userModel.getLastName())
                .mobile(userModel.getMobile())
                .email(userModel.getEmail())
                .dateOfBirth(LocalDate.from(userModel.getDateOfBirth()))
                .build();
        return userRequestSql ;

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
    private UserModel convertUserDtoToUserModel(UserRequestSql userRequestSql, UserModel userModel) {
//        userModel.setFirstName(userRequestSql.getFirstName());
//        userModel.setLastName(userRequestSql.getLastName());
//        userModel.setMobile(userRequestSql.getMobile());
//        userModel.setEmail(userRequestSql.getEmail());
//        userModel.setUpdatedBy(1);
//        userModel.setUpdatedAt(LocalDateTime.now());
//        return userModel;

        userModel = UserModel.builder()
                .firstName(userRequestSql.getFirstName())
                .lastName(userRequestSql.getLastName())
                .mobile(userRequestSql.getMobile())
                .email(userRequestSql.getEmail())
                .dateOfBirth(userRequestSql.getDateOfBirth().atStartOfDay())
                .createdAt(LocalDateTime.now())
                .updatedBy(1)
                .updatedAt(LocalDateTime.now())
                .build();

        return  userModel;
    }



}
