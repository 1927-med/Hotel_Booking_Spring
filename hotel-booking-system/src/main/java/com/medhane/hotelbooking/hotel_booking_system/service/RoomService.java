package com.medhane.hotelbooking.hotel_booking_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medhane.hotelbooking.hotel_booking_system.model.Room;
import com.medhane.hotelbooking.hotel_booking_system.repository.RoomRepository;

@Service
public class RoomService {
    
    @Autowired
    private RoomRepository roomRepository;
    
    public List<Room> getAvailableRooms() {
        return roomRepository.findByIsAvailableTrue();
    }
    
    public Room bookRoom(Room room) {
        room.setIsAvailable(false);
        return roomRepository.save(room);
    }
    
    public void cancelBooking(Room room) {
        room.setIsAvailable(true);
        roomRepository.save(room);
    }
    
    public Room getRoom(Long id) {
        return roomRepository.findById(id).orElse(null);
    }
    
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }
}
