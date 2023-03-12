package main.java.org.example.Algorithms.Easy.Attempted;

import java.util.ArrayList;

public class SeparateTheDigitsInAnArray {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            while (num > 0) {
                res.add(num % 10);
                num /= 10;
            }
        }
        int[] ret = new int[res.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = res.get(i);
        }
        return ret;
    }
}
