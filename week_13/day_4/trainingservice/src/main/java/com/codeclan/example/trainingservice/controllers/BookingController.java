package com.codeclan.example.trainingservice.controllers;

import com.codeclan.example.trainingservice.models.Booking;
import com.codeclan.example.trainingservice.models.Course;
import com.codeclan.example.trainingservice.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

//    @GetMapping
//    public List<Booking> getAllBooking() {
//        return bookingRepository.findAll();
//    }
}
