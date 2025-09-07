package com.lucentus.controllers;

import com.lucentus.data.LoginRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 */
@RequestMapping("/login")
public class LoginController {

    @PostMapping("/authorize")
    public void authorize(LoginRequest request) {

    }

    @PostMapping("/register")
    public void register(LoginRequest request) {

    }
}
