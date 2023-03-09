package org.example.Algorithms.Easy.Solved;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] ret = new int[nums.length * 2];
        int i = 0;
        for (int j = 0; j < nums.length; j++, i++) {
            ret[i] = nums[j];
        }
        for (int j = 0; j < nums.length; j++, i++) {
            ret[i] = nums[j];
        }
        return ret;
    }
}
