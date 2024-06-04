package com.example.demo.service.impl;

import com.example.demo.dto.UserDtoSql;

import com.example.demo.mysql.model.UserModel;
import com.example.demo.repository.Userrepository;
import com.example.demo.service.IUserSql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserServiceSql implements IUserSql {

    @Autowired
    Userrepository userrepository;

//    @Override
//    public UserDtoSql getAllDetails() {
//
//        Optional<UserModel> userModel = userrepository.findById(1);
//        UserDtoSql userDtoSql = new UserDtoSql();
//        if (userModel.isPresent()){
//            userDtoSql = convertUserModelToUserDtoSql(userModel.get());
//        }
//        return userDtoSql;
//    }
//    private UserDtoSql convertUserModelToUserDtoSql(UserModel userModel) {
//        UserDtoSql userDtoSql= new UserDtoSql();
//        userDtoSql.setId(userModel.getId());
//        userDtoSql.setUsername(userModel.getUsername());
//        userDtoSql.setFirstName(userModel.getFirstName());
//        userDtoSql.setLastName(userModel.getLastName());
//        userDtoSql.setMobile(userDtoSql.getMobile());
//        userDtoSql.setEmail(userDtoSql.getEmail());
//        return  userDtoSql;
//    }


    @Override
    public UserDtoSql getUserById(Integer id) {

        Optional<UserModel> userModel = userrepository.findById(id);
        UserDtoSql userDtoSql = new UserDtoSql();
        if (userModel.isPresent()){
            userDtoSql = convertUserModelToUserDtoSql(userModel.get());
        }
        return userDtoSql;
    }

    @Override
    public UserDtoSql createUser(UserDtoSql userDtoSql) {
        UserModel userModel = convertUserDtoToUserModel(userDtoSql);
        userModel = userrepository.save(userModel);
        return convertUserModelToUserDtoSql(userModel);


    }

    private UserDtoSql convertUserModelToUserDtoSql(UserModel userModel) {
        UserDtoSql userDtoSql= new UserDtoSql();
        userDtoSql.setId(userModel.getId());
        userDtoSql.setUsername(userModel.getUsername());
        userDtoSql.setFirstName(userModel.getFirstName());
        userDtoSql.setLastName(userModel.getLastName());
        userDtoSql.setMobile(userModel.getMobile());
        userDtoSql.setEmail(userModel.getEmail());
        return  userDtoSql;
    }

    private UserModel convertUserDtoToUserModel(UserDtoSql userDtoSql) {
        UserModel userModel = new UserModel();
        userModel.setUsername(userDtoSql.getUsername());
        userModel.setFirstName(userDtoSql.getFirstName());
        userModel.setLastName(userDtoSql.getLastName());
        userModel.setMobile(userDtoSql.getMobile());
        userModel.setEmail(userDtoSql.getEmail());
        userModel.setCreatedBy(1);
        userModel.setCreatedAt(LocalDateTime.now());
        userModel.setUpdatedBy(1);
        userModel.setUpdatedAt(LocalDateTime.now());
        return userModel;
    }




}
