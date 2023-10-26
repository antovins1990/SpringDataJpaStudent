package com.example.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.data.entity.Guardian;
import com.example.data.entity.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
class SpringDataJpaStudentApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void testSaveStudent() {
		Guardian g = Guardian.builder().name("Mathura").mobileNumber("908764345").build();
		Student s = Student.builder().firstName("Anto").emailId("anto.vins@gmail.com").lastName("Vins")
		.guardian(g).build();
		ObjectMapper o = new ObjectMapper();
		try {
			System.out.println(o.writeValueAsString(s));
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
