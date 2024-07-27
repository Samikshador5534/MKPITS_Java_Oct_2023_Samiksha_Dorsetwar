package com.mkpits.bank.service;

import com.mkpits.bank.dto.response.AccountResponseDto;

import java.util.List;

public interface IAccountService {
    public List<AccountResponseDto> getAllUserAccounts(Integer userId);

    List<AccountResponseDto> getAllAccounts();


//    long getTotalAccounts();

    long countTotalAccounts();
}