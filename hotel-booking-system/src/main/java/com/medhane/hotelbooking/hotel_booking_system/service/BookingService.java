package com.medhane.hotelbooking.hotel_booking_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medhane.hotelbooking.hotel_booking_system.model.Booking;
import com.medhane.hotelbooking.hotel_booking_system.model.Room;
import com.medhane.hotelbooking.hotel_booking_system.repository.BookingRepository;

@Service
public class BookingService {
    
    @Autowired
    private BookingRepository bookingRepository;
    
    @Autowired
    private RoomService roomService;
    
    public Booking bookRoom(Booking booking) {
        Room room = roomService.getRoom(booking.getRoom().getId());
        if (room != null && room.getIsAvailable()) {
            room.setIsAvailable(false);
            roomService.bookRoom(room);
            return bookingRepository.save(booking);
        } else {
            return null;
        }
    }
    
    public void cancelBooking(Booking booking) {
        Room room = roomService.getRoom(booking.getRoom().getId());
        if (room != null) {
            room.setIsAvailable(true);
            roomService.cancelBooking(room);
            bookingRepository.delete(booking);
        }
    }
    
    public Booking getBooking(Long id) {
        return bookingRepository.findById(id).orElse(null);
    }
    
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
}