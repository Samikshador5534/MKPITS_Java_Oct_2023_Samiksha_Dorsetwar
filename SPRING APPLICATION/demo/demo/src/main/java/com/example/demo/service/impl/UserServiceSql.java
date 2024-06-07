package com.example.demo.service.impl;

import com.example.demo.dto.UserSql;

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
    public UserSql getUserById(Integer id) {

        Optional<UserModel> userModel = userrepository.findById(id);
        UserSql userDtoSql = new UserSql();
        if (userModel.isPresent()){
            userDtoSql = convertUserModelToUserDtoSql(userModel.get());
        }
        return userDtoSql;
    }

    @Override
    public List<UserSql> getAllUsers() {

        List<UserModel> userModelList = (List<UserModel>) userrepository.findAll();
        List<UserSql> userDtoList = new ArrayList<>();
        for(UserModel userModel: userModelList){
            UserSql userSql = convertUserModelToUserDtoSql(userModel);
            userDtoList.add(userSql);
        }
        return userDtoList;
    }

    @Override
    public UserSql updateUser(UserSql userSql) {
        Optional<UserModel> userModelOptional = userrepository.findById(userSql.getId());
        if(userModelOptional.isEmpty()) {
            System.out.println("User data with id: " + userSql.getId() + " not found");
        } else {
            UserModel userModel = convertUserDtoToUserModel(userSql, userModelOptional.get());
            userModel.setId(userSql.getId());
            userModel = userrepository.save(userModel);
            return convertUserModelToUserDtoSql(userModel);
        }
        return userSql;
    }


    @Override
    public UserSql deleteUser(Integer id) {
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
    public UserSql updatePartialUser(UserSql userSql) {
        Optional<UserModel> userModelOptional = userrepository.findById(userSql.getId());
        if (userModelOptional.isEmpty()) {
            System.out.println("User data with id: " + userSql.getId() + " not found");
            return  null;
        } else {
            UserModel userModel = userModelOptional.get();
           // UserModel userModel = userModelOptional.get();
            userModel.setFirstName(userSql.getFirstName() != null && !userSql.getFirstName().equals(userModel.getFirstName()) ? userSql.getFirstName() : userModel.getFirstName());
            userModel.setLastName(userSql.getLastName() != null && !userSql.getLastName().equals(userModel.getLastName()) ? userSql.getLastName() : userModel.getLastName());
            userModel.setEmail(userSql.getEmail() != null && !userSql.getEmail().equals(userModel.getEmail()) ? userSql.getEmail() :userModel.getEmail());
            userModel.setMobile(userSql.getMobile() != null && !userSql.getMobile().equals(userModel.getMobile()) ? userSql.getMobile() :userModel.getMobile());
            userModel.setUpdatedBy(2);
            userModel.setUpdatedAt(LocalDateTime.now());
            userrepository.save(userModel);
            return  convertUserModelToUserDtoSql(userModel);
        }
    }


    @Override
    @Transactional
    public UserSql createUser(UserSql userDto) {

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
        return convertUserModelToUserDtoSql(userModel);
    }


    private UserSql convertUserModelToUserDtoSql(UserModel userModel) {
        UserSql userDtoSql= new UserSql();
        userDtoSql.setId(userModel.getId());
        userDtoSql.setFirstName(userModel.getFirstName());
        userDtoSql.setLastName(userModel.getLastName());
        userDtoSql.setMobile(userModel.getMobile());
        userDtoSql.setEmail(userModel.getEmail());
        return  userDtoSql;
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
    private UserModel convertUserDtoToUserModel(UserSql userSql, UserModel userModel) {
        userModel.setFirstName(userSql.getFirstName());
        userModel.setLastName(userSql.getLastName());
        userModel.setMobile(userSql.getMobile());
        userModel.setEmail(userSql.getEmail());
        userModel.setUpdatedBy(1);
        userModel.setUpdatedAt(LocalDateTime.now());
        return userModel;
    }



}
