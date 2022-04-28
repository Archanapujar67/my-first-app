package com.delithe.demo.controler;

import com.delithe.demo.EmployeeDetails;
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

@PostMapping("fetch-employee")
    public String requestEmployeeDetails(@RequestBody EmployeeDetails empDetails)
{
    return testService.addCustomer(empDetails);
}
}