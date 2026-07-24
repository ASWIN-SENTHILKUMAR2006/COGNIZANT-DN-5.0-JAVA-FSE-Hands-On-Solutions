package com.cognizant.JWT_handson;



import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(Principal principal) {
        // Spring Security already checked user & password!
        // principal.getName() gives "user"
        String token = jwtUtil.generateToken(principal.getName());

        // Return simple JSON: {"token": "..."}
        Map<String, String> response = new HashMap<>();
        response.put("token", token);
        return response;
    }
}