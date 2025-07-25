package com.medhane.hotelbooking.hotel_booking_system.controller;

import com.medhane.hotelbooking.hotel_booking_system.model.Room;
import com.medhane.hotelbooking.hotel_booking_system.service.RoomService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/login")
    public String login(Model model) {
       List<Room> rooms = roomService.getAvailableRooms(); 
        System.out.println("Available rooms: " + rooms.size());
        model.addAttribute("availableRooms", rooms);
        return "login-page";
    }

    
    
}


