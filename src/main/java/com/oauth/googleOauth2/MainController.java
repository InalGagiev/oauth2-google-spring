package com.oauth.googleOauth2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/home")
public class MainController {
    @GetMapping("/user")
    public ResponseEntity<?> protectedController(Principal principal){
        return ResponseEntity.ok("user:" + principal.getName());
    }

    @GetMapping
    public ResponseEntity<?> welcome(){
        return ResponseEntity.ok("welcome");
    }
}
