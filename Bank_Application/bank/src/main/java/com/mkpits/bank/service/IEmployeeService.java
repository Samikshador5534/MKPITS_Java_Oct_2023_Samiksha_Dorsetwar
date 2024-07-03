package com.mkpits.bank.service;

import com.mkpits.bank.dto.response.EmployeeResponseDto;
import com.mkpits.bank.dto.response.UserResponseDto;

import java.util.List;

public interface IEmployeeService {
    public List<EmployeeResponseDto> getAllEmployees();
}
