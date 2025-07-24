package com.medhane.hotelbooking.hotel_booking_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medhane.hotelbooking.hotel_booking_system.model.User;
import com.medhane.hotelbooking.hotel_booking_system.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    
    public void deleteUser(User user) {
        userRepository.delete(user);
    }
}
