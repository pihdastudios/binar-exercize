package com.example.HelloWorld03.chapter2;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        var target = 10;
        int start = 0;
        int end = arr.length - 1;
        var loc = 0;
        for (int i = 0; i < arr.length; i++) {
            int middle = (end - start) / 2;
            if (arr[i] == target) {
                loc = i;
                break;
            } else if (arr[middle] > target) {
                end = middle - (start - end);
            } else {
                start = middle + (start - end);
            }
        }
        System.out.println(loc);
    }
}
