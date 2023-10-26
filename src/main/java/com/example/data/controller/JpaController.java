package com.example.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.data.entity.Course;
import com.example.data.entity.CourseMaterial;
import com.example.data.entity.Student;
import com.example.data.repository.CourseMaterialRepositrory;
import com.example.data.repository.CourseRepository;
import com.example.data.repository.StudentRepository;

@RestController
@RequestMapping("/jpa")
public class JpaController {

	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private CourseRepository courseRepo;
	
	@Autowired
	private CourseMaterialRepositrory crepo;
	
	@PutMapping("/save")
	public Student saveStudentInfo(@RequestBody Student student) {
		 return studentRepo.save(student);
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStudents(){
		return studentRepo.findAll();
	}
	
	@PostMapping("/postCourse")
	public Course saveCourse(@RequestBody Course course) {
		
		return courseRepo.save(Course.builder().courseName("java").courseCredit(6)
				.cmaterial(CourseMaterial.builder().url("Java materials").build()).build());
	}
	
	@PostMapping("/courseMaterial")
	public CourseMaterial postCoursematerial() {
		return crepo.save(CourseMaterial.builder().url("Nexus").build());
	}
}
