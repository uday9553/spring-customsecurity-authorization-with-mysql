package com.uday.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest/hello")
@RestController
public class HelloResource {

    @GetMapping("/all")
    public String hello() {
        return "Hello from hello() method";
    }

    //you can even add more roles by giving @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/auth/all")
    public String securedHello() {
        return "response after authorization";
    }

    @GetMapping("/auth/alternate")
    public String alternate() {
        return "response just by authentication";
    }
}
