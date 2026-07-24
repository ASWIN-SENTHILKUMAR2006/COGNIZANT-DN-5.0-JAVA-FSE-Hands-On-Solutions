package com.cognizant.JWT_handson;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // Disable CSRF for REST APIs
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/authenticate").authenticated() // Require login for /authenticate
                .anyRequest().permitAll()
            )
            .httpBasic(Customizer.withDefaults()); // Enable Basic Auth (-u user:pwd)

        return http.build();
    }
}