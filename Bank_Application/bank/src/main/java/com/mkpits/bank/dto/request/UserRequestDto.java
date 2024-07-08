package com.mkpits.bank.dto.request;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDto {


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





    private String address;

    //for credentails

    private String pinCode;
    private String userName;
    private String account_Type;
    private String password;
    private String passwordSalt;
}


