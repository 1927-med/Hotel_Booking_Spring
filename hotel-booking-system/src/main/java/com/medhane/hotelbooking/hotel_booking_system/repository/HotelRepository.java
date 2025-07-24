package com.medhane.hotelbooking.hotel_booking_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medhane.hotelbooking.hotel_booking_system.model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

    
} // This interface extends JpaRepository, which provides CRUD operations for the Hotel entity.
