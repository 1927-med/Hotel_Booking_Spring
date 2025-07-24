package com.medhane.hotelbooking.hotel_booking_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medhane.hotelbooking.hotel_booking_system.model.Room;
import com.medhane.hotelbooking.hotel_booking_system.service.RoomService;

@RestController
@RequestMapping("/rooms")
public class RoomController {
    
    @Autowired
    private RoomService roomService;
    
    @GetMapping
    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }
    
    @GetMapping("/{id}")
    public Room getRoom(@PathVariable Long id) {
        return roomService.getRoom(id);
    }
    
    @PostMapping
    public Room saveRoom(@RequestBody Room room) {
        return roomService.bookRoom(room);
    }
    
    @DeleteMapping("/{id}")
    public void deleteRoom(@PathVariable Long id) {
        Room room = roomService.getRoom(id);
        if (room != null) {
            roomService.cancelBooking(room);
        }
    }
}
