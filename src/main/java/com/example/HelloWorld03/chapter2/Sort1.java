package com.example.HelloWorld03.chapter2;

import java.util.Arrays;

public class Sort1 {
    public static void main(String[] args) {
        int[] arr = {100, 20, 15, 30, 5, 75, 40}; // kecil ke besar
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    var tmp = arr[j + 1];
                    //swap
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
