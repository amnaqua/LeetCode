package main.java.org.example.Algorithms.Easy.Solved;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0, j; i < nums.length; i++) {
            j = i + 1;
            for (; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
}
