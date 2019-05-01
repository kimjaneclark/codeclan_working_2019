package com.codeclan.example.UserFilesFolders.repository;

import com.codeclan.example.UserFilesFolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
