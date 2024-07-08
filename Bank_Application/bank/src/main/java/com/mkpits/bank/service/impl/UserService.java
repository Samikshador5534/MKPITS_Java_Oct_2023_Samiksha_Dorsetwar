package com.mkpits.bank.service.impl;

import com.mkpits.bank.dto.request.UserRequestDto;
import com.mkpits.bank.dto.response.UserResponseDto;
import com.mkpits.bank.model.Account;
import com.mkpits.bank.model.Address;
import com.mkpits.bank.model.User;
import com.mkpits.bank.model.UserCredential;
import com.mkpits.bank.repository.AccountRepository;
import com.mkpits.bank.repository.AddressRepository;
import com.mkpits.bank.repository.UserCredentialRepository;
import com.mkpits.bank.repository.UserRepository;
import com.mkpits.bank.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    UserCredentialRepository userCredentialRepository;

    @Autowired
    AddressRepository addressRepository;


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

    @Override
    public UserResponseDto getUserByIdUser(Integer id) {
        Optional<User> userModel = userRepository.findById(Long.valueOf(id));
        UserResponseDto userDto = new UserResponseDto();
        if (userModel.isPresent()){
            userDto = convertUserModelToUserDto(userModel.get());
        }
        return userDto;
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
                .build();
        return getUserDto;
    }

    private UserResponseDto convertUserModelToUserDto(User user ,UserCredential userCredential,Address address,Account account) {
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
                .address(address.getAddress())
                .pincode(address.getPinCode())
                .account_type(account.getAccount_type())
                .build();
        return getUserDto;
    }

   @Override
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        User user = convertUserRequestDtoToUser(userRequestDto);
       String cinNo= String.valueOf(LocalDateTime.now()).replaceAll("[^0-9]", "").substring(0,17);
        user.setCin(cinNo);
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy(1);
        user = userRepository.save(user);

        // For
        Account account = new Account();
        account.setUserId(user.getId());
        account.setAccount_type(userRequestDto.getAccount_Type());
        String cityCode = "456";String districtCode="852";String stateCode="624";String remaingAccountNumber = "0123";
        account.setAccountNo(stateCode+cityCode+districtCode+remaingAccountNumber);
        account.setOpening(LocalDate.now());
        account.setBalance(0.0);
        account = accountRepository.save(account);


        UserCredential userCredential = new UserCredential();
        userCredential.setUserId(user.getId());
//        userCredential.setUserName(userRequestDto.getUserName());
        userCredential.setPassword(userRequestDto.getPassword());
        userCredential=userCredentialRepository.save(userCredential);


        Address address = new Address();
        address.setUserId(user.getId());
        address.setAddress(userRequestDto.getAddress());
        address.setPinCode(userRequestDto.getPinCode());
        address = addressRepository.save(address);

        return convertUserModelToUserDto(user , userCredential , address ,account);

    }


    private User convertUserRequestDtoToUser(UserRequestDto userRequestDto) {
        return User.builder()
                .firstName(userRequestDto.getFirstName())
                .middleName(userRequestDto.getMiddleName())
                .lastName(userRequestDto.getLastName())
                .mobile(userRequestDto.getMobile())
                .email(userRequestDto.getEmail())
                .gender(userRequestDto.getGender())
                .dateOfBirth(userRequestDto.getDob())
                .aadharCard(userRequestDto.getAdharNo())
                .build();
    }



}
