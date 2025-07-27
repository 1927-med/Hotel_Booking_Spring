package com.medhane.hotelbooking.hotel_booking_system.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.ui.Model;

@ControllerAdvice
public class ErrorController {
     @ExceptionHandler(Exception.class)
    public String handleError(Model model, Exception ex) {
        model.addAttribute("error", ex.getMessage());
        return "error";
    }
    
}
