package com.example.webapi.api.login;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.core.annotation.AliasFor;

@AllArgsConstructor
@Getter
public class LoginRequestDto {
    private String email;
    private String password;
}
