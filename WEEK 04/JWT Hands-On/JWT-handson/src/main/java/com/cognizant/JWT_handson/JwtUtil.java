package com.cognizant.JWT_handson;

import java.security.Key;
import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {

    private final Key key = Keys.hmacShaKeyFor("MySecretKeyForJwtTokenGeneration123456!".getBytes());

    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 3600000)) // Valid for 1 hour
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }
}