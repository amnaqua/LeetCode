package main.java.org.example.Algorithms.Easy.Solved;

public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;

        for (int i = nums.length - 1; i >= 0; --i) {
            for (int j = i; j >= 0; --j) {
                sum += nums[j];
            }
            result[i] = sum;
            sum = 0;
        }
        return result;
    }
}
