package com.example.HelloWorld03.chapter1;

import java.util.Arrays;
import java.util.List;

public class MatchDemo2 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15);
        var list2 = List.of(11, 8, 4, 7);

        System.out.println(list1);
        System.out.println(list2);

        for (var e : list1) {
            if (!list2.contains(e)) {
                System.out.print(e + " ");
            }
        }
        System.out.println();
    }
}
