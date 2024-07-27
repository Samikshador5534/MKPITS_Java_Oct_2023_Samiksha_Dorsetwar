package com.mkpits.bank.service.impl;

import com.mkpits.bank.dto.response.AccountResponseDto;
import com.mkpits.bank.model.Account;
import com.mkpits.bank.repository.AccountRepository;
import com.mkpits.bank.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService implements IAccountService {

    @Autowired
    AccountRepository accountRepository;

    public List<AccountResponseDto> getAllUserAccounts(Integer userId) {
//        System.out.println(userId);
        List<Account> accountList = accountRepository.findAccountsByUserId(userId);
        List<AccountResponseDto> accountResponceDtoList = new ArrayList<>();
        for (Account account : accountList){
            AccountResponseDto accountResponceDto = convertUserModelToUserDto(account);
            accountResponceDtoList.add(accountResponceDto);
        }


        return accountResponceDtoList;
    }

    @Override
    public List<AccountResponseDto> getAllAccounts() {
        List<Account> accountList = (List<Account>) accountRepository.findAll();
        List<AccountResponseDto> accountResponseDtoList=new ArrayList<>();
        for (Account account1 : accountList){
            AccountResponseDto accountResponseDto =convertAccountModelToAccountDto(account1);
            accountResponseDtoList.add(accountResponseDto);

        }
        return  accountResponseDtoList;
    }

    private AccountResponseDto convertAccountModelToAccountDto(Account account1) {

        AccountResponseDto accountResponseDto = AccountResponseDto.builder()
                .id(account1.getId())
                .account_type(account1.getAccount_type())
                .accountNo(account1.getAccountNo())
                .balance(account1.getBalance())
                .opening(account1.getOpening())
                .userId(account1.getUserId())
                .build();
        return accountResponseDto;

    }

    private AccountResponseDto convertUserModelToUserDto(Account account) {
        AccountResponseDto responceDto= AccountResponseDto.builder()
//                .id(account.getUserId())
                .account_type(account.getAccount_type())
                .accountNo(account.getAccountNo())
                .balance(account.getBalance())
                .opening(account.getOpening())
                .build();
        return responceDto;
    }

    @Override
    public long countTotalAccounts() {
        return accountRepository.count();
    }
}

