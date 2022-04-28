package com.delithe.demo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class EmployeeDetails {
    private int empId;
    private String empName;
    private  String empAddress;
    private int empSalary;
}
