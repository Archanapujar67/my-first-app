package com.delithe.demo.serviceimpl;

import com.delithe.demo.entity.Student;
import com.delithe.demo.repository.StudentDetails;
import com.delithe.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private  StudentDetails studentDetails;
    @Override
    public String fetchProductDetails(String productName) {
        if (productName != null) {
            switch (productName) {
                case "Pen":
                    return "You have Selected Pen";
                case "Book":
                    return "You have Selected Book";
                case "Eraser":
                    return "You have Selected Eraser";
                default:
                    return "You have not selected  any product";
            }

        } else {
            return "Product Should Not be Null";
        }

    }

    @Override
    public String fetchYourResult(int percentage) {
        return "You have Scored Distinction";
    }

    @Override
    public String addStudent(Student student) {
        Student stud=new Student();
       stud.setName(student.getName());
       stud.setPercentage(student.getPercentage());
        studentDetails.save(stud);

        return "Student Information is Added";
    }


}