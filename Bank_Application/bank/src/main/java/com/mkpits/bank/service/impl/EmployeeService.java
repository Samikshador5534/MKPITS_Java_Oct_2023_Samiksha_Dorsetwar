package com.mkpits.bank.service.impl;

import com.mkpits.bank.dto.response.EmployeeResponseDto;

import com.mkpits.bank.model.Employee;
import com.mkpits.bank.repository.EmployeeRepository;
import com.mkpits.bank.repository.UserRepository;
import com.mkpits.bank.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired

    EmployeeRepository employeeRepository;


    @Override
    public List<EmployeeResponseDto> getAllEmployees() {
        List<Employee> EmployeeList = (List<Employee>) employeeRepository.findAll();
        List<EmployeeResponseDto> employeeResponseDtoList =new ArrayList<>();
        for (Employee employee : EmployeeList){
            EmployeeResponseDto getEmployeeDto =convertEmployeeModelToEmployeeDto(employee);
           employeeResponseDtoList.add(getEmployeeDto);
        }
        return employeeResponseDtoList;

    }

    private EmployeeResponseDto convertEmployeeModelToEmployeeDto(Employee employee) {
       EmployeeResponseDto getEmployeeDto =EmployeeResponseDto.builder()
                .id(employee.getId())
                .firstName(employee.getFirstName())
               .address(employee.getAddress())
                .lastName(employee.getLastName())
                .email(employee.getEmail())
                .mobile(employee.getMobile())
                .gender(employee.getGender())
               .city(employee.getCity())
                        .build();
        return getEmployeeDto;
    }

}
