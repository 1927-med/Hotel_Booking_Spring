package com.medhane.hotelbooking.hotel_booking_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "login-page";
    }
}
