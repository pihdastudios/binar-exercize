package com.example.HelloWorld03.chapter2;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Pascal {
    public static void main(String[] args) {
        var n = 5;
        for (int line = 1; line <= n; line++) {
            for (int j = 0; j <= n - line; j++) {

                // for left spacing
                System.out.print(" ");
            }

            // used to represent C(line, i)
            int C = 1;
            for (int i = 1; i <= line; i++) {

                // The first value in a line is always 1
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }
}
