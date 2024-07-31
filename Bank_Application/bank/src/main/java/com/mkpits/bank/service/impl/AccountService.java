package com.mkpits.bank.service.impl;

import com.mkpits.bank.dto.request.UserRequestDto;
import com.mkpits.bank.dto.response.AccountResponseDto;
import com.mkpits.bank.model.*;
import com.mkpits.bank.repository.*;
import com.mkpits.bank.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService implements IAccountService {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    UserStateRepository userStateRepository;

    @Autowired
    UserCityRepository userCityRepository;

    @Autowired
    UserDistrictRepository userDistrictRepository;

    @Autowired
    UserRepository userRepository;

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

    @Override
    public AccountResponseDto deleteAccount(String accountNo) {
            String account = String.valueOf(accountRepository.findIdByAccountNumber(accountNo));

            accountRepository.deleteById(Integer.valueOf(account));
            System.out.println("User data with id: " + account + " deleted successfully");

            return null;
        }

    @Override
    public Integer getUserIdByAccountNo(String accountNo) {
           Integer userId = accountRepository.findUserIdByAccountNumber(accountNo);
           return userId;
        }

    @Override
    public UserRequestDto addAccount(UserRequestDto userRequestDto) {
        // Fetch the user entity from the database using userId

        User user = userRepository.findById(Long.valueOf(userRequestDto.getUserId()))
                .orElseThrow(() -> new RuntimeException("User not found"));

        // Create a new account entity
        Account account = new Account();

        //generating account number here
        State state = userStateRepository.findStateByName(userRequestDto.getState());
       District district =  userDistrictRepository.findDistrictByName(userRequestDto.getDistrict());
        City city =  userCityRepository.findCityByName(userRequestDto.getCity());

        //getting last account number for increasing new by one
        String lastAccountnumber = accountRepository.findLastAccountNumber();

        account.setAccountNo(String.format("%02d",state.getId())+String.format("%04d",district.getId())+String.format("%04d",city.getId())+String.format("%04d",Integer.valueOf(lastAccountnumber.substring(lastAccountnumber.length()-4))+1));


        account.setBalance(userRequestDto.getBalance());
        account.setAccount_type(userRequestDto.getAccount_Type());
        account.setOpening(LocalDate.now());
        account.setUserId(user.getId());


        // Save the account entity to the database
        Account savedAccount = accountRepository.save(account);


        return userRequestDto;
    }
    }




