package com.mkpits.bank.service;

import com.mkpits.bank.dto.request.EmployeeRequestDto;
import com.mkpits.bank.dto.response.EmployeeResponseDto;

import java.util.List;

public interface IEmployeeService {
    public List<EmployeeResponseDto> getAllEmployees();

    EmployeeResponseDto createEmployee(EmployeeRequestDto employeeRequestDto);
}
