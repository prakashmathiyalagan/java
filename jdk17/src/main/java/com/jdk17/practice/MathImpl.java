package com.jdk17.practice;

public class MathImpl {
    public static void main(String[] args) {
        //Math is a functional interface. With lambda implementation
        Math math = new MathImpl().addNumbers();
        System.out.println(math.sum(2, 3));
    }

    /**
     * @return {@link Integer}
     */
    public Math addNumbers() {
        return Integer::sum;
    }
}
