package com.practice.java9.second;

public class PrivateStaticMethod implements TestInf {
    public static void main(String[] args) {
        TestInf inf = new PrivateStaticMethod();
        System.out.println(inf.getHelloString("World"));
    }
}

interface TestInf {
    private static String printHello(String name) {
        return "Hello, " + name + "!";
    }

    default String getHelloString(String name) {
        return printHello(name);
    }
}
