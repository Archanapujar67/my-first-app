package com.delithe.demo.service;

import com.delithe.demo.EmployeeDetails;

public interface TestService {

    String fetchProductDetails(String productName);


    String fetchYourResult(int percentage);

    String addCustomer(EmployeeDetails empDetails);
}
