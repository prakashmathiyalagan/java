package com.practice.java8;

import com.practice.Employee;

import java.util.Optional;

public class OptionalCheck {
    public static void main(String[] args) {
        Employee emp = new Employee("Name-2", "Dept-2", null);
        //ofNullable will not throw NullPointerException when value is null
        Optional<Double> ofNullableSalary = Optional.ofNullable(emp.getSalary());
        System.out.println("ofNullableSalary: " + ofNullableSalary);
        //of will throw NullPointerException when value is null
        Optional<Double> ofSalary = Optional.of(emp.getSalary());
        System.out.println("ofSalary: " + ofSalary);
    }
}
