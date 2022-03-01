package com.example.HelloWorld03.chapter1;

public class PassByValue {
    String str;
    public static void main(String[] args) {
        var passByValue = new PassByValue();
        passByValue.str = "10";
        changeVar(passByValue);
        System.out.println(passByValue.str);
    }

    private static void changeVar(PassByValue passByValue) {
        passByValue.str = "dsf";
    }
}
