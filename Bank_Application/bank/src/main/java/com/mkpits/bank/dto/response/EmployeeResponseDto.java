package com.mkpits.bank.dto.response;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.*;

import java.time.LocalDate;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeResponseDto {

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
