package com.mkpits.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForgotPasswordController {

    @GetMapping("/forgotpassword")
    public String forgotpassword()
    {
        return "forgot-password";
    }
}
