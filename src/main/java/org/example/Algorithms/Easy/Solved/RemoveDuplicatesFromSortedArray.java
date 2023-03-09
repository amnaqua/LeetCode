package org.example.Algorithms.Easy.Solved;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int cur = nums[0];
        int len = nums.length;
        int j = 1;
        for (int i = 0; i < len; i++) {
            if (nums[i] != cur) {
                cur = nums[i];
                int temp;
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return j;
    }
}
