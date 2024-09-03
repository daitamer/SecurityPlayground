package com.myorg.SecurityPlayground.controller;

import com.myorg.SecurityPlayground.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")

public class SecurityController {
//    @Autowired
//    private SecurityService securityService;

    @GetMapping("/open/greeting")
    public ResponseEntity<String> greeting() {
       return new ResponseEntity<String> ("Welcome, please login.", HttpStatusCode.valueOf(200));
    }

    @GetMapping("/protected/greeting")
    public ResponseEntity<String> protectedGreeting() {
        return new ResponseEntity<String> ("Welcome back our dear, valued, wonderful user", HttpStatusCode.valueOf(200));
    }

}
