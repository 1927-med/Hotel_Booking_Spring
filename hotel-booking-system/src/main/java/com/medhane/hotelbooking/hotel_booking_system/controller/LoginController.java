package com.medhane.hotelbooking.hotel_booking_system.controller;

import com.medhane.hotelbooking.hotel_booking_system.model.Room;
import com.medhane.hotelbooking.hotel_booking_system.service.RoomService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private RoomService roomService;

   @GetMapping("/login")
    public String login(@RequestParam(required = false) String error, 
                       @RequestParam(required = false) String logout,
                       Model model) {
        
        if (error != null) {
            model.addAttribute("error", "Invalid username/password");
        }
        
        if (logout != null) {
            model.addAttribute("message", "Logged out successfully");
        }
        
        return "login-page";

    
    
}
}


