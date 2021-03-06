package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WhiskyRepository extends JpaRepository<Whisky, Long>, WhiskyRepositoryCustom {

    List<Whisky> findWhiskiesByYear(int year);

    List<Whisky> findWhiskiesByDistilleryIdAndAge(Long id, int age);

    public List<Whisky> findWhiskeyFromAParticularRegion(String region);
}


//    Get all the whisky from a particular region