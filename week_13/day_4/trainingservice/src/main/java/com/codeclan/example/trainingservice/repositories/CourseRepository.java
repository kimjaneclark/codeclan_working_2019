package com.codeclan.example.trainingservice.repositories;

import com.codeclan.example.trainingservice.models.Course;
import com.codeclan.example.trainingservice.projections.EmbedBookingInCourse;
import com.codeclan.example.trainingservice.projections.EmbedBookings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedBookingInCourse.class)
public interface CourseRepository extends JpaRepository<Course, Long> {
}
