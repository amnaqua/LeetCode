package org.example.Algorithms.Easy.Solved;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int savePos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                savePos = i;
                return savePos;
            } else if (i == nums.length - 1 && nums[i] < target) {
                savePos = i + 1;
            } else if (nums[i] == target) {
                savePos = i;
                return savePos;
            }
        }
        return savePos;
    }
}
