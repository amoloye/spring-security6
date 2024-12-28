package org.example.springsecurity6.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("")
    public String welcome(){
        return "Welcome to Adedamola security platform";
    }

    @GetMapping("/csrf")
    public CsrfToken getToken(HttpServletRequest request){
       return (CsrfToken) request.getAttribute("_csrf");
    }
}