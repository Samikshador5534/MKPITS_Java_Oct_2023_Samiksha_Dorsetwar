package com.mkpits.bank.service.impl;

import com.mkpits.bank.dto.response.UserResponseDto;
import com.mkpits.bank.model.User;
import com.mkpits.bank.repository.UserRepository;
import com.mkpits.bank.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserResponseDto> getAllUsers() {
        List<User> usersList = (List<User>) userRepository.findAll();
        List<UserResponseDto> userDtoArrayList=new ArrayList<>();
        for (User user : usersList){
            UserResponseDto getUserDto =convertUserModelToUserDto(user);
            userDtoArrayList.add(getUserDto);
        }
        return userDtoArrayList;
    }

    private UserResponseDto convertUserModelToUserDto(User user) {
        UserResponseDto getUserDto =UserResponseDto.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .middleName(user.getMiddleName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .mobile(user.getMobile())
                .gender(user.getGender())
                .cin(user.getCin())
                .dob(user.getDateOfBirth())
                .adharNo(user.getAadharCard())
                .build();
        return getUserDto;
    }
}
