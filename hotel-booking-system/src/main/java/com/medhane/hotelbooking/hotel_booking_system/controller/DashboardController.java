package com.medhane.hotelbooking.hotel_booking_system.controller;

import com.medhane.hotelbooking.hotel_booking_system.model.Room;
import com.medhane.hotelbooking.hotel_booking_system.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DashboardController {

    private final RoomService roomService;

    // Constructor injection
    public DashboardController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/home")
    public String dashboard(Model model, 
                          @AuthenticationPrincipal UserDetails userDetails) {
        
        if (userDetails == null) {
            return "redirect:/login";
        }
        
        try {
            model.addAttribute("availableRooms", roomService.getAvailableRooms());
            model.addAttribute("username", userDetails.getUsername());
            return "dashboard";
        } catch (Exception e) {
            model.addAttribute("error", "Error loading rooms");
            return "dashboard";
        }
    }
}
