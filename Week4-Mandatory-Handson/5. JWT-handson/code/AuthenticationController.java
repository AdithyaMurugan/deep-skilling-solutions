package com.cognizant.spring_learn.controller;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest; // for Spring Boot 3+
import java.util.Base64;
import java.util.Date;

@RestController
public class AuthenticationController {

    private final String SECRET_KEY = "secret123"; // Change to environment variable in real apps

    @GetMapping("/authenticate")
    public String authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            return "Missing or invalid Authorization header.";
        }

        String base64Credentials = authHeader.substring("Basic ".length());
        byte[] decoded = Base64.getDecoder().decode(base64Credentials);
        String[] credentials = new String(decoded).split(":", 2);

        String username = credentials[0];
        String password = credentials[1];

        // Hardcoded auth check (for testing)
        if ("user".equals(username) && "pwd".equals(password)) {
            String token = Jwts.builder()
                    .setSubject(username)
                    .setIssuedAt(new Date())
                    .setExpiration(new Date(System.currentTimeMillis() + 60 * 60 * 1000)) // 1 hour
                    .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                    .compact();
            return "{\"token\":\"" + token + "\"}";
        }

        return "Invalid credentials";
    }
}
