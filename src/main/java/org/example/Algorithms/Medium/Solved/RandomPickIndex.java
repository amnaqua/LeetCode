package main.java.org.example.Algorithms.Medium.Solved;

import java.util.ArrayList;
import java.util.List;

public class RandomPickIndex {
    private int[] nums;

    public RandomPickIndex(int[] nums) {
        this.nums = nums;
    }

    public int pick(int target) {
        List<Integer> targets = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                targets.add(i);
            }
        }
        int ret = (int) (Math.random() * nums.length);
        while (!targets.contains(ret)) {
            ret = (int) (Math.random()  * nums.length);
        }
        return ret;
    }
}
