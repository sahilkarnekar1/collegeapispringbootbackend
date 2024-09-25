package com.example.collegeapis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.collegeapis.entity.College;
import com.example.collegeapis.entity.Course;
import com.example.collegeapis.repository.CollegeRepo;

@RestController
@CrossOrigin
@RequestMapping("/api/colleges")
public class CollegeController {

    @Autowired
    private CollegeRepo collegeRepository;

    @GetMapping
    public List<College> getAllColleges() {
        return collegeRepository.findAll();
    }

    @GetMapping("/{id}/courses")
    public List<Course> getCoursesByCollege(@PathVariable Long id) {
        return collegeRepository.findById(id).orElseThrow().getCourses();
    }
}

