package com.mkpits.bank.dto.response;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountResponseDto {

    private Integer id;
    private Integer userId;
    private String accountNo;
    private String account_type;
    private double balance;
    private LocalDate opening;
}
