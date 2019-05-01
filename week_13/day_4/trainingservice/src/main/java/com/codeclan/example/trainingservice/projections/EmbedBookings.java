package com.codeclan.example.trainingservice.projections;


import com.codeclan.example.trainingservice.models.Customer;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedBookingInCustomers", types = Customer.class)
public interface EmbedBookings {
    String getName();
    String getTown();
    int getAge();
    List getBookings();



}
