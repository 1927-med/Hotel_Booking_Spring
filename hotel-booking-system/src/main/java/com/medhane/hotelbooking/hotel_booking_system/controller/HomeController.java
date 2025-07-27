package com.medhane.hotelbooking.hotel_booking_system.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import com.medhane.hotelbooking.hotel_booking_system.service.RoomService;


@Controller
public class HomeController {
    private final RoomService roomService;
    
    public HomeController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("featuredRooms", roomService.getAllRooms());
        return "home";
    }
}
