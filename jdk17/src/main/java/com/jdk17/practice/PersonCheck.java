package com.jdk17.practice;

public class PersonCheck {
    public static void main(String[] args) {
        Person person = new Person("A", "London");
        System.out.println("Name: " + person.name());
        System.out.println("City: " + person.city());
    }
}
