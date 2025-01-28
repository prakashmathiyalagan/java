package com.practice.java8;

public class DefaultMethodInInterface {
    public static void main(String[] args) {
        Vehicle v1 = new DieselCar();
        System.out.println("v1: " + v1.getFuel());
        Vehicle v2 = new PetrolCar();
        System.out.println("v2: " + v2.getFuel());
        Vehicle v3 = new ElectricCar();
        System.out.println("v3: " + v3.getFuel());
    }
}
