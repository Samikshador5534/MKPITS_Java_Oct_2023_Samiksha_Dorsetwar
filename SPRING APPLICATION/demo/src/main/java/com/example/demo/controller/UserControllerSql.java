package com.example.demo.controller;


import com.example.demo.dto.request.UserRequestDto;
import com.example.demo.dto.response.ErrorResponseDto;
import com.example.demo.dto.response.UserGetResponseDto;
import com.example.demo.dto.response.UserPostResponseDto;
import com.example.demo.service.IUserSql;
import com.example.demo.validator.UserValidator;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
public class UserControllerSql {
    @Autowired

    IUserSql iUserSql;

    @Autowired
    UserValidator userValidator;


    // @RequestMapping(value = "/v1/users/{id}", method = RequestMethod.GET)
    @GetMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> getUser(@PathVariable("id") Integer id) {
        UserRequestDto userDtoSql = iUserSql.getUserById(id);
        System.out.println("Service Constructor: " + iUserSql.hashCode());
        return ResponseEntity.ok(userDtoSql);

    }

    //@RequestMapping(value = "/v1/users/{id}", method = RequestMethod.PUT)
    @PutMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> updateUser(@PathVariable("id") Integer id, @RequestBody UserRequestDto userRequestDto) {
        userRequestDto.setId(id);
        UserRequestDto userDtoReturn = iUserSql.updateUser(userRequestDto);
        return ResponseEntity.ok(userDtoReturn);
    }

  //  @RequestMapping(value = "/v1/users/{id}", method = RequestMethod.PATCH)
  @PatchMapping (path = "/v1/users/{id}")
    public ResponseEntity<Object> updatePartialUser(@PathVariable("id") Integer id, @RequestBody UserRequestDto userRequestDto) {
        userRequestDto.setId(id);
        UserRequestDto userDtoReturn = iUserSql.updatePartialUser(userRequestDto);
        return ResponseEntity.ok(userDtoReturn);
    }

    //@RequestMapping(value = "/v1/users/{id}", method = RequestMethod.DELETE)
    @DeleteMapping (path = "/v1/users/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable("id") Integer id) {
        UserRequestDto userRequestDto = iUserSql.deleteUser(id);
        if (userRequestDto != null) {
            return new ResponseEntity<>("User with ID " + id + " deleted successfully", HttpStatus.OK);
        } else  {
            return new ResponseEntity<>("User with ID " + id + " not found", HttpStatus.NOT_FOUND);
        }

    }



    //@RequestMapping(value = "/v1/users", method = RequestMethod.GET)
    @GetMapping(path = "/v1/users" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllUsers() {
        List<UserGetResponseDto> userGetResponseDto = iUserSql.getAllUsers();
        return ResponseEntity.ok(userGetResponseDto);

    }

   // @RequestMapping(value = "/v1/users", method = RequestMethod.POST)
   @PostMapping(path = "/v1/users")
    public ResponseEntity<Object> createUser( @Valid @RequestBody UserRequestDto userDtoSql) {
       boolean isValidAge = userValidator.validateAge(userDtoSql.getDateOfBirth());
       if(!isValidAge) {
           ErrorResponseDto errorResponseDto = ErrorResponseDto.builder()
                   .errorMessage("Age should be greated than 18 yrs")
                   .httStatusCode(HttpStatus.BAD_REQUEST.value())
                   .build();
           return ResponseEntity.badRequest().body(errorResponseDto);
       }
        UserPostResponseDto userPostResponseDto = iUserSql.createUser(userDtoSql);
      //  return ResponseEntity.ok(userResponseSql);
       return ResponseEntity.created(URI.create("/v1/users/" + userPostResponseDto.getId())).body(userPostResponseDto);


    }

}
