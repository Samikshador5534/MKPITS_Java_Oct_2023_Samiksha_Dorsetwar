package com.mkpits.bank.service;

import com.mkpits.bank.dto.request.UserRequestDto;
import com.mkpits.bank.dto.response.AccountResponseDto;

import java.util.List;

public interface IAccountService {
    public List<AccountResponseDto> getAllUserAccounts(Integer userId);

    List<AccountResponseDto> getAllAccounts();


//    long getTotalAccounts();

    long countTotalAccounts();

    AccountResponseDto deleteAccount(String accountNo);

    Integer getUserIdByAccountNo(String accountNo);

    UserRequestDto addAccount(UserRequestDto userRequestDto);
}