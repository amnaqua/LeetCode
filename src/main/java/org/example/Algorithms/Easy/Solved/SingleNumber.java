package org.example.Algorithms.Easy.Solved;

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int numWithoutPair = nums[0];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                numWithoutPair = nums[i];
                return numWithoutPair;
            }
        }
        return numWithoutPair;
    }
}
