package com.codeclan.example.UserFilesFolders.repository;

import com.codeclan.example.UserFilesFolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
