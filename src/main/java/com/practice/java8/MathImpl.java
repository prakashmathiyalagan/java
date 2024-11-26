package com.practice.java8;

public class MathImpl {
    public static void main(String[] args) {
        //Math is a functional interface. With lambda implementation
        Math math = (a, b) -> a + b;
        System.out.println(math.sum(2, 3));
    }
}
