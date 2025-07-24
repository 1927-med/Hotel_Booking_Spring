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

import com.medhane.hotelbooking.hotel_booking_system.model.Booking;
import com.medhane.hotelbooking.hotel_booking_system.service.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    
    @Autowired
    private BookingService bookingService;
    
    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }
    
    @GetMapping("/{id}")
    public Booking getBooking(@PathVariable Long id) {
        return bookingService.getBooking(id);
    }
    
    @PostMapping
    public Booking saveBooking(@RequestBody Booking booking) {
        return bookingService.bookRoom(booking);
    }
    
    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable Long id) {
        Booking booking = bookingService.getBooking(id);
        if (booking != null) {
            bookingService.cancelBooking(booking);
        }
    }
}