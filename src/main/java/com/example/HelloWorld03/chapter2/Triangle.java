package com.example.HelloWorld03.chapter2;

public class Triangle {
    public static void main(String[] args) {
        var n = 5;
//        assert ((n % 2) == 0);
        for (var i = 1; i <= n; i++) {
            for (var j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
