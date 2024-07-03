package com.mkpits.bank.controller;

import com.mkpits.bank.dto.response.EmployeeResponseDto;
import com.mkpits.bank.dto.response.UserResponseDto;
import com.mkpits.bank.service.IEmployeeService;
import com.mkpits.bank.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class AdminDashboardController {

@Autowired
    IUserService iUserService;

@Autowired
    IEmployeeService iemployeeService;


        @GetMapping("/admindashboard")

        public String admin(Model model)
        {
            List<UserResponseDto> user = iUserService.getAllUsers();
            List<EmployeeResponseDto> employee = iemployeeService.getAllEmployees();
            model.addAttribute("admin1",user);
            model.addAttribute("employee_management",employee);
            return "admin1";
        }
    @GetMapping("/userdetails/v1/")
    public String userDetails(@PathVariable Long id, Model model) {

        return "userdetails";
    }
    }
