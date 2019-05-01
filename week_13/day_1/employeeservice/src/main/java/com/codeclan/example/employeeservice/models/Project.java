package com.codeclan.example.employeeservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="projects")
public class Project {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="name")
    private String name;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name ="employee_project",
            joinColumns = {@JoinColumn(
                    name="project_id",
                    nullable = false,
                    updatable = false)},
            inverseJoinColumns = {@JoinColumn(
                    name="employee_id",
                    nullable = false,
                    updatable = false)}

    )
    private List<Employee> employees;


    public Project(String name) {
        this.name = name;
        this.employees = new ArrayList<Employee>();

    }

    public Project() {
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}



