package com.example.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.data.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
