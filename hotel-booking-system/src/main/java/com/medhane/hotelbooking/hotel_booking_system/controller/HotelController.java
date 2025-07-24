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

import com.medhane.hotelbooking.hotel_booking_system.model.Hotel;
import com.medhane.hotelbooking.hotel_booking_system.service.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    
    @Autowired
    private HotelService hotelService;
    
    @GetMapping
    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }
    
    @GetMapping("/{id}")
    public Hotel getHotel(@PathVariable Long id) {
        return hotelService.getHotel(id);
    }
    
    @PostMapping
    public Hotel saveHotel(@RequestBody Hotel hotel) {
        return hotelService.saveHotel(hotel);
    }
    
    @DeleteMapping("/{id}")
    public void deleteHotel(@PathVariable Long id) {
        Hotel hotel = hotelService.getHotel(id);
        if (hotel != null) {
            hotelService.deleteHotel(hotel);
        }
    }
    
}