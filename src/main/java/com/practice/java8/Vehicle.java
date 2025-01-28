package com.practice.java8;

public interface Vehicle {
    default String getFuel() {
        return "Diesel";
    }
}
