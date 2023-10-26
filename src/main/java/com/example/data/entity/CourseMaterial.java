package com.example.data.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="course_material")
public class CourseMaterial {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long courseMaterialId;
	@Column(name="url")
	private String url;
	
	@OneToOne(cascade = CascadeType.ALL, fetch =FetchType.EAGER)
	@JoinColumn(name="course_id", referencedColumnName = "course_id")
	private Course course;

}
