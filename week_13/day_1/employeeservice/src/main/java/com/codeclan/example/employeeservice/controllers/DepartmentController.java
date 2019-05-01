package com.codeclan.example.employeeservice.controllers;

import com.codeclan.example.employeeservice.models.Department;
import com.codeclan.example.employeeservice.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/departments/")
public class DepartmentController {

    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping(value="/")
    public List<Department> getAllShip(){
        return departmentRepository.findAll();
    }
}

