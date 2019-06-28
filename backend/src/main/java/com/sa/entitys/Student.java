package com.sa.entity;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.*;
@Entity  //บอกว่าเป็น class entity class ที่เก็บขอมูล
@Data  // lombox จะสร้าง method getter setter ให้เอง
@Table(name="student") //ชื่อตาราง
public class Student {
        @Id  //  Annotations  @Id  บอกว่าเป็น  Primary  key
        @GeneratedValue   // Annotations Generate id เอง ตอน insert 
        private Long id;
        private String firstName;
        private String lastName;

}