package com.sa;

import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.stream.Stream;
import java.util.*;
import org.springframework.boot.ApplicationRunner;

import com.sa.repository.StudentRepository;
import com.sa.entity.Student;

@SpringBootApplication
public class DemoSaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSaApplication.class, args);
	}
	@Bean
	ApplicationRunner init(StudentRepository studentRepository){
		return  args ->{ 
			Student s = new Student();
			s.setFirstName("keng");
			s.setLastName("CPE ---> ");
			studentRepository.save(s);
		};
	}
}
