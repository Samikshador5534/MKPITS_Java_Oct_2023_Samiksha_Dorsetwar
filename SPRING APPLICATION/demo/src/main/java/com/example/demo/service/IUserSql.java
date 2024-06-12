package com.example.demo.service;

import com.example.demo.dto.request.UserRequestSql;
import com.example.demo.dto.response.UserResponseSql;

import java.util.List;

public interface IUserSql {
//    public UserDtoSql getAllDetails();

    public UserRequestSql getUserById(Integer id);

    public List<UserRequestSql>getAllUsers();

    public UserRequestSql updateUser(UserRequestSql userRequestSql);

    //public UserRequestSql createUser(UserRequestSql userDtoSql);


     public UserRequestSql deleteUser(Integer id);

    public UserRequestSql updatePartialUser(UserRequestSql userRequestSql);

    public UserResponseSql createUser(UserRequestSql userRequestDto);
}
