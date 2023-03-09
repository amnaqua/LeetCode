package org.example.Algorithms.Easy.Attempted;

import java.util.Arrays;

public class AddStrings {
    public String addStrings(String num1, String num2) {
        char[] save1 = num1.toCharArray();
        char[] save2 = num2.toCharArray();
        if (num1.length() >= num2.length()) {
            for (int i = save2.length - 1, j = save1.length - 1; i >= 0; i--, j--) {
                int add = save2[i] - '0';
                if (save1[j] + add > 9) {
                }
            }
            return Arrays.toString(save1);
        } else {
            for (int i = save2.length - 1, j = save1.length - 1; j >= 0; i--, j--) {
                save2[i] += save1[j] - '0';
            }
            return Arrays.toString(save2);
        }
    }
}
