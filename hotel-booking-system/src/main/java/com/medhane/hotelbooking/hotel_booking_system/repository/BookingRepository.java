package com.medhane.hotelbooking.hotel_booking_system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medhane.hotelbooking.hotel_booking_system.model.Booking;
import com.medhane.hotelbooking.hotel_booking_system.model.Room;
import com.medhane.hotelbooking.hotel_booking_system.model.User;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByRoom(Room room);
    Booking findByUser(User user);
}
