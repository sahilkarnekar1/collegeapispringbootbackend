package com.example.collegeapis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.collegeapis.entity.College;

@Repository
public interface CollegeRepo extends JpaRepository<College, Long> {
    List<College> findAll();
}

