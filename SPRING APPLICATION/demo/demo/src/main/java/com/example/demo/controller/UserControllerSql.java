package com.example.demo.controller;


import com.example.demo.dto.UserSql;
import com.example.demo.service.IUserSql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserControllerSql {
    @Autowired

    IUserSql iUserSql;

    @RequestMapping(value = "/v1/users/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getUser(@PathVariable("id") Integer id) {
        UserSql userDtoSql = iUserSql.getUserById(id);
        System.out.println("Service Constructor: " + iUserSql.hashCode());
        return ResponseEntity.ok(userDtoSql);

    }

    @RequestMapping(value = "/v1/users/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateUser(@PathVariable("id") Integer id, @RequestBody UserSql userSql) {
        userSql.setId(id);
        UserSql userDtoReturn = iUserSql.updateUser(userSql);
        return ResponseEntity.ok(userDtoReturn);
    }

    @RequestMapping(value = "/v1/users/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<Object> updatePartialUser(@PathVariable("id") Integer id, @RequestBody UserSql userSql) {
        userSql.setId(id);
        UserSql userDtoReturn = iUserSql.updatePartialUser(userSql);
        return ResponseEntity.ok(userDtoReturn);
    }

    @RequestMapping(value = "/v1/users/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteUser(@PathVariable("id") Integer id) {
        UserSql userSql = iUserSql.deleteUser(id);
        if (userSql != null) {
            return new ResponseEntity<>("User with ID " + id + " deleted successfully", HttpStatus.OK);
        } else  {
            return new ResponseEntity<>("User with ID " + id + " not found", HttpStatus.NOT_FOUND);
        }

    }



    @RequestMapping(value = "/v1/users", method = RequestMethod.GET)
    public ResponseEntity<Object> getAllUsers() {
        List<UserSql> userDtoSql = iUserSql.getAllUsers();
        return ResponseEntity.ok(userDtoSql);

    }

    @RequestMapping(value = "/v1/users", method = RequestMethod.POST)
    public ResponseEntity<Object> createUser(@RequestBody UserSql userDtoSql) {
        UserSql userDtoReturn = iUserSql.createUser(userDtoSql);
        return ResponseEntity.ok(userDtoReturn);
    }

}
