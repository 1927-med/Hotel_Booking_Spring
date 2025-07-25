package com.medhane.hotelbooking.hotel_booking_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "Welcome to the Hotel Booking System";
    }
}
