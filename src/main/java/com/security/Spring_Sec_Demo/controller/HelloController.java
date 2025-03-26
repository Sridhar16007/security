package com.security.Spring_Sec_Demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping ("/home")
    public String greet(HttpServletRequest request) {
        return "Hello " + request.getSession().getId() ;
    }

    @GetMapping("/about")
    public String about(HttpServletRequest request){
        return "about page "+ request.getSession().getId();
    }


}
