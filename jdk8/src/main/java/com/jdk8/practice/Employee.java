package com.jdk8.practice;

public class Employee {
    public Employee(String name, String dept, Double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public Double getSalary() {
        return salary;
    }

    private String name;
    private String dept;
    private Double salary;

}