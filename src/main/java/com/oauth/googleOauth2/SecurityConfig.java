package com.oauth.googleOauth2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {
    @Bean
    protected SecurityFilterChain configure(HttpSecurity http) throws Exception {
         http
                .csrf().disable()
                 .authorizeHttpRequests(authorize ->
                         authorize
                                 .requestMatchers("/home/user").authenticated()
                                 .anyRequest().permitAll()
                 )
                 .oauth2Login();

         return http.build();
    }
}
