package com.mkpits.bank.dto.response;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionResponseDto {

    private Long id;
    private Long userId;
    private String accountNumber;
    private String transactionType;
    private String transactionStatus;
    private String remark;
    private LocalDateTime createdAt;
    private String createdBy;
}
