package com.example.HelloWorld03.chapter2;

public class FIb {
    public static void main(String[] args) {
        var n = 10;
        var prev1 = 0;
        var prev2 = 1;
        System.out.println(0);
        System.out.println(1);
        for (var i = 2; i < n; i++) {
            var tmp = prev1;
            System.out.println(prev1 + prev2);
            prev1 = prev2;
            prev2 = tmp + prev2;
        }
    }
}
