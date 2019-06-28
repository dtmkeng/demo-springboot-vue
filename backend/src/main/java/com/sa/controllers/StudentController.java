package com.sa.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;
import java.util.*;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sa.repository.StudentRepository;
import com.sa.entity.Student;
@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api")
public class StudentController { 
    @Autowired private StudentRepository studentRepository;

    @GetMapping("/student")
    public List<Student>  getStudentAll(){
         return this.studentRepository.findAll().stream().collect(Collectors.toList());
    }
}