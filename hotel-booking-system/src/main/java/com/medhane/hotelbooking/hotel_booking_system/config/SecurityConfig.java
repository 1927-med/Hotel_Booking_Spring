package com.medhane.hotelbooking.hotel_booking_system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.FormLoginConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {


        http.authorizeRequests(requests -> requests
                .anyRequest().authenticated())
                .formLogin(withDefaults());
   return http.build();


/* 
        http
                .authorizeHttpRequests(requests -> requests
                        .requestMatchers("/login").permitAll() // allow public access
                       .anyRequest().authenticated())
                .formLogin(login -> login
                        .loginPage("/login") // I am telling spring to use the login page
                        .permitAll())
                .logout(logout -> logout
                        .permitAll());

    return http.build();
    }

    */
}

    private Customizer<FormLoginConfigurer<HttpSecurity>> withDefaults() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'withDefaults'");
    }

}