package com.myorg.SecurityPlayground.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
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
    public ResponseEntity<String> protectedGreeting(@AuthenticationPrincipal OAuth2User user) {
        String userName = user.getAttribute("name");
        String githubUserName = user.getAttribute("login");
        return new ResponseEntity<String> ("Welcome back our dear, valued, wonderful user " + userName + " AKA " + githubUserName, HttpStatusCode.valueOf(200));
    }

}
