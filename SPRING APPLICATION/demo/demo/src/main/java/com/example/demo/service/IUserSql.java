package com.example.demo.service;

import com.example.demo.dto.UserDtoSql;

public interface IUserSql {
//    public UserDtoSql getAllDetails();

    public UserDtoSql getUserById(Integer id);
    public UserDtoSql createUser(UserDtoSql userDtoSql);

}
