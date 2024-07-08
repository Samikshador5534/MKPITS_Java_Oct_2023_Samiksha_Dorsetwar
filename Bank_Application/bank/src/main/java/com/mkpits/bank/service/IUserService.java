package com.mkpits.bank.service;

import com.mkpits.bank.dto.request.UserRequestDto;
import com.mkpits.bank.dto.response.UserResponseDto;

import java.util.List;

public interface IUserService {

    public List<UserResponseDto > getAllUsers();

    UserResponseDto getUserByIdUser(Integer id);

    UserResponseDto createUser(UserRequestDto userRequestDto);


//    UserResponseDto getUser(Integer id);
}
