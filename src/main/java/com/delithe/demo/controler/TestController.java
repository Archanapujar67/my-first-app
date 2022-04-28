package com.delithe.demo.controler;

import com.delithe.demo.entity.Student;
import com.delithe.demo.repository.StudentDetails;
import com.delithe.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Scanner;

@RestController
public class TestController {

    Scanner s = new Scanner(System.in);

    @GetMapping("test")
    public String myFirstMethod() {
        return "Hi, This is SpringBoot ";
    }

    @Autowired
    private TestService testService;
    @GetMapping("fetch-product-details/{productName}")
    public  String displayProducts(@PathVariable String productName)
    {
        String result=testService.fetchProductDetails(productName);
        return  result;
    }
    @GetMapping("fetch-resultfetch-result/{percentage}")
    public  String displayResult(@PathVariable int percentage)
    {
        String result=testService.fetchYourResult(percentage);
        return  result;
    }
    @PostMapping("add-student")
    public String addStudentDetails(@RequestBody Student student)
    {
        return testService.addStudent(student);
    }


}