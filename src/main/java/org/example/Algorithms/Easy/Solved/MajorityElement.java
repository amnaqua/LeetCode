package main.java.org.example.Algorithms.Easy.Solved;

import java.util.HashSet;
import java.util.Set;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int counter = 0;
        Set<Integer> dic = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (dic.contains(nums[i])) {
                continue;
            }
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    counter++;
                }
                if (counter > nums.length / 2) {
                    return nums[j];
                }
            }
            dic.add(nums[i]);
            counter = 0;
        }
        return nums[0];
    }
}
