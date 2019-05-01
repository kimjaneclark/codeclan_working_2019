package com.codeclan.example.trainingservice.projections;

import com.codeclan.example.trainingservice.models.Course;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;




@Projection(name = "embedBookingInCourse", types = Course.class)
public interface EmbedBookingInCourse {
    String getName();
    String getTown();
    int getRating();
    List getBookings();



}
