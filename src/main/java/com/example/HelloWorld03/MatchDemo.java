package com.example.HelloWorld03;

import java.util.ArrayList;
import java.util.List;

// git clone
public class MatchDemo {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(56);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);
        list2.add(78);
        list2.add(9);
        for (var e : list1) {
            if (list2.contains(e)) {
                System.out.println(e);
            }
        }

    }
}
