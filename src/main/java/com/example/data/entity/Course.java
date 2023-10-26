package com.example.data.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
	
	@Id
	@SequenceGenerator(name ="course_sequence",
	sequenceName = "course_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_sequence")
	@Column(name="course_id")
	private long courseId;
	@Column(name="course_name")
	private String courseName;
	@Column(name="course_credit")
	private int courseCredit;
	
	@OneToOne(mappedBy = "course", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private CourseMaterial cmaterial;
	
	@ManyToMany
	@JoinTable(
			joinColumns = {@JoinColumn(name ="studentId")}
			, inverseJoinColumns = {@JoinColumn(name="course_id")})
	private List<Student> student;

}
