package com.example.HelloWorld03.chapter2;

public class Prime {
    public static void main(String[] args) {
        var n = 1000000;
        var num = 0;
        for (var i = 0; true; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                num++;
            }
            if (num == n) {
                break;
            }
        }
    }
    private static boolean isPrime(int num) {
        for (var i = 2; i * i <= num; i++)
            if (num % i == 0)
                return false;
        return num > 1;
    }
}
