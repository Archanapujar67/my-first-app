package com.delithe.demo.repository;

import com.delithe.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDetails extends JpaRepository<Student,Integer> {

}
