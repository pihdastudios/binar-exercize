package com.example.HelloWorld03.chapter2;

import java.util.Arrays;

public class SortRecursive {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int n) {
//        for (int i = 0; i < arr.length - 1; i++) {

//        }

        if (n == 1) {
            return;
        }

        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                var tmp = arr[j + 1];
                //swap
                arr[j + 1] = arr[j];
                arr[j] = tmp;
            }
        }
        sort(arr, n - 1);
    }
}
