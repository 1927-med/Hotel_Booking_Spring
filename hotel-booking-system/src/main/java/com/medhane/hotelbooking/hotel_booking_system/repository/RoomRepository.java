package com.medhane.hotelbooking.hotel_booking_system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medhane.hotelbooking.hotel_booking_system.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {
    List<Room> findByIsAvailableTrue();
    Room findByRoomNumber(String roomNumber);
}
