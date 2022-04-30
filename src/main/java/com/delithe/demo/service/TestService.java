package com.delithe.demo.service;

import com.delithe.demo.entity.Student;
import com.delithe.demo.repository.StudentDetails;

public interface TestService {

    String fetchProductDetails(String productName);


    String fetchYourResult(int percentage);

    String addStudent(Student student);
}
