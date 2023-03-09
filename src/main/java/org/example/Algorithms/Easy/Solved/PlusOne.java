package org.example.Algorithms.Easy.Solved;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int last = digits.length - 1;
        digits[last]++;
        for (int i = last; i > 0; i--) {
            if (digits[i] == 10) {
                digits[i - 1]++;
                digits[i] = 0;
            }
            if (i - 1 == 0) {
                if (digits[i - 1] == 10) {
                    int[] res = new int[digits.length + 1];
                    res[0] = 1;
                    digits[0] = 0;
                    for (int j = 1; j < digits.length; j++) {
                        res[j] = digits[j - 1];
                    }
                    return res;
                }
                break;
            }
        }
        if (last == 0 && digits[0] == 10) {
            int[] res = new int[2];
            res[0] = 1;
            return res;
        }
        return digits;
    }
}
