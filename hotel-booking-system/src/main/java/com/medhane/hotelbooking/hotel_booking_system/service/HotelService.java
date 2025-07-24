package com.medhane.hotelbooking.hotel_booking_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medhane.hotelbooking.hotel_booking_system.model.Hotel;
import com.medhane.hotelbooking.hotel_booking_system.repository.HotelRepository;

@Service
public class HotelService {
    
    @Autowired
    private HotelRepository hotelRepository;
    
    public Hotel getHotel(Long id) {
        return hotelRepository.findById(id).orElse(null);
    }
    
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }
    
    public Hotel saveHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }
    
    public void deleteHotel(Hotel hotel) {
        hotelRepository.delete(hotel);
    }
}
