package main.java.org.example.Algorithms.Medium.Solved;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        Set<Integer> dic = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (dic.contains(nums[i])) {
                continue;
            }
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    counter++;
                }
                if (counter > nums.length / 3 && !res.contains(nums[i])) {
                    res.add(nums[i]);
                }
            }
            dic.add(nums[i]);
            counter = 0;
        }

        return res;
    }
}
