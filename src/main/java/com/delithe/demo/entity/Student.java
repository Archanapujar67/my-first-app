package com.delithe.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="student_id")
    private int student_id;

    @Column(name="student_name")
    private int student_name;
    @Column(name="student_percentage")
    private int student_percentage;

}
