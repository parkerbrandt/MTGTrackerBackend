package com.lucentus.controllers;

import com.lucentus.data.User;
import com.lucentus.data.requests.LoginRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 */
@Controller
@Slf4j
@RequestMapping("/login")
public class LoginController {

    private JdbcTemplate jdbc;

    @PostMapping("/authorize")
    public void authorize(LoginRequest request) {
        log.info("Authorize endpoint triggered");

        // TODO: Check if user exists

        // User exists, return user information
        User user = jdbc.queryForObject(
                "SELECT ID, NAME from User where NAME=?",
                this::mapRowToUser, request.getUsername()
        );
    }

    @PostMapping("/register")
    public void register(LoginRequest request) {
        log.info("Register endpoint triggered");

        // TODO: Ensure username does not already exist

        // TODO: Create user in DB
    }


    private User mapRowToUser(ResultSet rs, int rowNum) throws SQLException {
        return new User(
            rs.getString("id"),
            rs.getString("name")
        );
    }
}
