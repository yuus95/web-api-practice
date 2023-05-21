package com.example.webapi;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/login")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public String login(String email, String password) {
        String result = "email " + email + "\n password " + password;
        System.out.println("result " + result);
        return result;
    }
}
