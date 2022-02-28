package com.example.HelloWorld03;

public class FizzBuzz {
    public static void main(String[] args) {
        int num = 17;
        for (var i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.print("Fizz");
            } else if (i % 5 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }
}
