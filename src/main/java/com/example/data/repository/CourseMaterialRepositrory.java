package com.example.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.data.entity.CourseMaterial;

@Repository
public interface CourseMaterialRepositrory extends JpaRepository<CourseMaterial, Long> {

}
