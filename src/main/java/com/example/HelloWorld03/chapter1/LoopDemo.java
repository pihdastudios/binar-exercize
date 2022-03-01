package com.example.HelloWorld03.chapter1;

public class LoopDemo {
    public static void main(String[] args) {
        for (int r = 0; r < 7; r++) {
            for (int c = 1; c < r; c++) {
                System.out.print(c);
            }
            System.out.println();
        }
//        Integer.parseInt()
    }
}
