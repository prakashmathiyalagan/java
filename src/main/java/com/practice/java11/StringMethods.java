package com.practice.java11;

public class StringMethods {
    public static void main(String[] args) {
        String str = " This is Java 11 new String methods example!  ";
        System.out.println("Original string length: " + str.length());
        System.out.println("isBlank: " + str.isBlank());
        System.out.println("Strip: " + str.strip().length());
        System.out.println("Lines: " + str.lines().count());
        System.out.println("stripLeading: " + str.stripLeading().length());
        System.out.println("stripTrailing: " + str.stripTrailing().length());
        System.out.println("Repeat: " + str.repeat(3).length());
    }
}