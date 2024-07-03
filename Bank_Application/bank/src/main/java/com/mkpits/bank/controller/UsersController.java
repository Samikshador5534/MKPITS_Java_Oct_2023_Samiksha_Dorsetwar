//package com.mkpits.bank.controller;

//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class UsersController {
//
//    @GetMapping("/users")
//    public String getUsers() {
//        return "users";
//    }
//}


//import com.mkpits.bank.dto.response.UserResponseDto;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Controller
//public class UsersController {
//
//    @GetMapping("/manageUsers")
//    public String getManageUsers(Model model) {
//        // Mock data (replace with actual data retrieval logic)
//        List<UserResponseDto> userResponseDtoList = new ArrayList<>();
//
//        UserResponseDto userResponseDto1 = UserResponseDto.builder()
//                .id(1L)
//                .username("John Doe")
//                .email("john.doe@example.com")
//                .mobile("4584584958")
//                .gender("Male")
//                .cin("CIN345464")
//                .dob("1997-07-20")
//                .build();
//
//        UserResponseDto userResponseDto2 = UserResponseDto.builder()
//                .id(2L)
//                .username("Jane Smith")
//                .email("jane.smith@example.com")
//                .mobile("876123433")
//                .gender("Female")
//                .cin("CIN123456")
//                .dob("1995-05-15")
//                .build();
//
//        userResponseDtoList.add(userResponseDto1);
//        userResponseDtoList.add(userResponseDto2);
//
//        model.addAttribute("users", userResponseDtoList);
//
//        return "admin1"; // Returns the main admin dashboard template
//    }
//}
