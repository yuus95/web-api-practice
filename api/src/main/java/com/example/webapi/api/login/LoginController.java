package com.example.webapi.api.login;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/login")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public String login(@RequestBody LoginRequestDto loginRequestDto) {
        String result = "email " + loginRequestDto.getEmail() + "\n password " + loginRequestDto.getPassword();
        System.out.println("result " + result);
        return result;
    }
}
