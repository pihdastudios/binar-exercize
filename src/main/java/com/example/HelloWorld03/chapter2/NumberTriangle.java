package com.example.HelloWorld03.chapter2;

public class NumberTriangle {
    public static void main(String[] args) {
        var n = 5;
        for (var i = 1; i <= n; i++) {
            for (var j = 1; j <= n - i + 1; j++){
                System.out.print(j);
            }
            for (var j = i; j <= n - 1; j++){
                System.out.print(n - j);
            }
            System.out.println();
        }
    }
}
