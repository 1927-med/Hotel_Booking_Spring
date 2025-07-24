package com.medhane.hotelbooking.hotel_booking_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medhane.hotelbooking.hotel_booking_system.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}