package com.example.HelloWorld03;

public class HelloWorld2 {
    public static void main(String[] args) {
        printWOParam();
        var hi = "Hi ";
        System.out.println(hi + printParam("Binarian"));
    }

    private static String printParam(String hi) {
        return hi;
    }

    private static void printWOParam() {
        System.out.println("Hi Binarian");
    }
}
