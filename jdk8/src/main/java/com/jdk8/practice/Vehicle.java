package com.jdk8.practice;

public interface Vehicle {
    default String getFuel() {
        return "Diesel";
    }
}
