package com.mkpits.bank.dto.response;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {

    private Integer id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String mobile;
    private Character gender;
    private String adharNo;
    private String cin;
    private LocalDate dob;
}
