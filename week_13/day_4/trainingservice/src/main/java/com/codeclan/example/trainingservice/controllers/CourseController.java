package com.codeclan.example.trainingservice.controllers;

import com.codeclan.example.trainingservice.models.Course;
import com.codeclan.example.trainingservice.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;


//    @GetMapping
//    public List<Course> getAllCourses() {
//        return courseRepository.findAll();
//    }
}
