package com.mkpits.bank.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeRequestDto {

    private Integer id;
    private String firstName;
    private String address;
    private String lastName;
    private String mobile;
    private String email;
    private Character gender;
    private String city;
    private String state;
    private String postal_code;

}
