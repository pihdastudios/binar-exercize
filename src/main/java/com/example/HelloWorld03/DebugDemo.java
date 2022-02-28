package com.example.HelloWorld03;

import java.util.ArrayList;
import java.util.List;

public class DebugDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(9);
        nums.add(95);
        nums.add(97);

        for (var num : nums) {
            System.out.println(num);
        }
    }
}
