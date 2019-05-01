package com.codeclan.example.trainingservice.components;

import com.codeclan.example.trainingservice.models.Booking;
import com.codeclan.example.trainingservice.models.Course;
import com.codeclan.example.trainingservice.models.Customer;
import com.codeclan.example.trainingservice.repositories.BookingRepository;
import com.codeclan.example.trainingservice.repositories.CourseRepository;
import com.codeclan.example.trainingservice.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;




    public DataLoader(){

    }


    public void run(ApplicationArguments args) {
        Customer customer1 = new Customer("Kim", "Glasgow", 41);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Susan", "Edinburgh", 34);
        customerRepository.save(customer2);

        Course course1 = new Course("ITIL", "Glasgow", 3);
        courseRepository.save(course1);

        Course course2 = new Course("Python for Dummies", "Edinburgh", 5);
        courseRepository.save(course2);

        Booking booking1 = new Booking("12/4/2019", customer1, course1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("12/4/2019", customer2, course2);
        bookingRepository.save(booking2);
    }
}
