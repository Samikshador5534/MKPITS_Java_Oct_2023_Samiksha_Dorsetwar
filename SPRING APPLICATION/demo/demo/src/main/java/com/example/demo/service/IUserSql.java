package com.example.demo.service;

import com.example.demo.dto.UserSql;
import org.hibernate.sql.Update;

import java.util.List;

public interface IUserSql {
//    public UserDtoSql getAllDetails();

    public UserSql getUserById(Integer id);

    public List<UserSql>getAllUsers();

    public UserSql updateUser(UserSql userSql);

    public UserSql createUser(UserSql userDtoSql);


     public UserSql deleteUser(Integer id);

    public UserSql updatePartialUser(UserSql userSql);
}
