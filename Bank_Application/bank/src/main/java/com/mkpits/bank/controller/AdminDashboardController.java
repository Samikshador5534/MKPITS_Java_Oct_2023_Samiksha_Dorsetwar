package com.mkpits.bank.controller;

import com.mkpits.bank.dto.request.UserRequestDto;
import com.mkpits.bank.dto.response.AccountResponseDto;
import com.mkpits.bank.dto.response.EmployeeResponseDto;
import com.mkpits.bank.dto.response.UserResponseDto;
import com.mkpits.bank.model.User;
import com.mkpits.bank.service.IAccountService;
import com.mkpits.bank.service.IEmployeeService;
import com.mkpits.bank.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AdminDashboardController {

@Autowired
    IUserService iUserService;

@Autowired
    IEmployeeService iemployeeService;

@Autowired
IAccountService iAccountService;



        @GetMapping("/admindashboard")
        public String admin(Model model)
        {
            List<UserResponseDto> user = iUserService.getAllUsers();
            List<EmployeeResponseDto> employee = iemployeeService.getAllEmployees();
            model.addAttribute("admin1",user);
            model.addAttribute("employee_management",employee);
            return "admin1";
        }
    @GetMapping("/userdetails/v1/{userId}") // Add {id} to specify it's a path variable
    public String adminCustomerAccounts(@PathVariable("userId") Integer userId, Model model) {
        UserResponseDto userDto = iUserService.getUserByIdUser(userId);
        List  <AccountResponseDto> accountResponceDto= iAccountService.getAllUserAccounts(userId);
        model.addAttribute("admin1",userDto);
        model.addAttribute("accounts",accountResponceDto);

        return "userdetails"; // Assuming this is your Thymeleaf template name
    }

    @PostMapping("/admin1/user/register")
    public String registerUser(@ModelAttribute UserRequestDto userRequestDto, Model model) {

        UserResponseDto userResponseDto = iUserService.createUser(userRequestDto);
        List<UserResponseDto> user = iUserService.getAllUsers();
        model.addAttribute("admin1", user);
        return "admin1"; // The view name of the success page
    }
}

