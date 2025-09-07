package com.lucentus.data.requests;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
public class LoginRequest {
    String username;
    String password;
}
