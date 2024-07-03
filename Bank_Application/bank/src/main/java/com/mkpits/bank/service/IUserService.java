package com.mkpits.bank.service;

import com.mkpits.bank.dto.response.UserResponseDto;

import java.util.List;

public interface IUserService {

    public List<UserResponseDto > getAllUsers();
}
