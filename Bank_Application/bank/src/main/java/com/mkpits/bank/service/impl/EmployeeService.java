package com.mkpits.bank.service.impl;

import com.mkpits.bank.dto.request.EmployeeRequestDto;
import com.mkpits.bank.dto.response.EmployeeResponseDto;

import com.mkpits.bank.model.Employee;
import com.mkpits.bank.repository.EmployeeRepository;
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

    public EmployeeResponseDto createEmployee(EmployeeRequestDto employeeRequestDto) {
        Employee employee = convertEmployeeDtoToEmployeeModel(employeeRequestDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return convertEmployeeModelToEmployeeDto(savedEmployee);
    }

    private Employee convertEmployeeDtoToEmployeeModel(EmployeeRequestDto employeeRequestDto) {
        return Employee.builder()
                .firstName(employeeRequestDto.getFirstName())
                .lastName(employeeRequestDto.getLastName())
                .email(employeeRequestDto.getEmail())
                .mobile(employeeRequestDto.getMobile())
                .gender(employeeRequestDto.getGender())
                .address(employeeRequestDto.getAddress())
                .city(employeeRequestDto.getCity())
                .build();

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
