
package com.sa.repository;

import com.sa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin(origins = "http://localhost:8080")
public interface StudentRepository extends JpaRepository<Student, String> {
    
}