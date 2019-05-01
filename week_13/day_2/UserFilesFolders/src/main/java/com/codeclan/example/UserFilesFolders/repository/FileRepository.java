package com.codeclan.example.UserFilesFolders.repository;

import com.codeclan.example.UserFilesFolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
