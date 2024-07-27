package com.mkpits.bank.service;

import com.mkpits.bank.dto.response.TransactionResponseDto;
import com.mkpits.bank.dto.response.UserResponseDto;

import java.util.List;

public interface ITransactionService {

    public List<TransactionResponseDto> getAllTransaction();
}
