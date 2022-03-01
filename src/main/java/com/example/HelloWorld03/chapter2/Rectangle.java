package com.example.HelloWorld03.chapter2;

public class Rectangle {
    public static void main(String[] args) {
        var w = 10;
        var h = 10;

        printStartEnd(w);
        printCenter(w, h);
        printStartEnd(w);
    }

    private static void printCenter(int w, int h) {
        for (int i = 0; i < h - 2; i++) {
            for (int j = 0; j < w; j++) {
                if (j == 0) {
                    System.out.print("*");
                } else if (j == h - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printStartEnd(int w) {
        for (int i = 0; i < w; i++) {
            System.out.print("*");
        }
        System.out.println();
    }


}
