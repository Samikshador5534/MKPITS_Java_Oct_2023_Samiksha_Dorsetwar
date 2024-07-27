package com.mkpits.bank.service.impl;

import com.mkpits.bank.dto.response.TransactionResponseDto;
import com.mkpits.bank.model.Transaction;
import com.mkpits.bank.repository.TransactionRepository;
import com.mkpits.bank.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService implements ITransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public List<TransactionResponseDto> getAllTransaction() {

        List<Transaction> transactionList = (List<Transaction>) transactionRepository.findAll();
        List<TransactionResponseDto> transactionResponseDtoList = new ArrayList<>();

        for (Transaction transaction : transactionList) {
            TransactionResponseDto transactionDto = convertTransactionModelToTransactionDto(transaction);
            transactionResponseDtoList.add(transactionDto);
        }

        return transactionResponseDtoList;
    }

    private TransactionResponseDto convertTransactionModelToTransactionDto(Transaction transaction) {

        TransactionResponseDto transactionResponseDto = TransactionResponseDto.builder()
//                .id(transaction.getId())
                .userId(transaction.getUserId())
                .accountNumber(transaction.getAccountNumber())
                .transactionType(transaction.getTransactionType())
                .transactionStatus(transaction.getTransactionStatus())
                .remark(transaction.getRemark())
                .createdAt(transaction.getCreatedAt())
                .createdBy(transaction.getCreatedBy())
                .build();

        return  transactionResponseDto;
    }
}
