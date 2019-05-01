package com.codeclan.example.trainingservice.repositories;

import com.codeclan.example.trainingservice.models.Customer;
import com.codeclan.example.trainingservice.projections.EmbedBookings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedBookings.class)
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
