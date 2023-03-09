package org.example.Algorithms.Hard.Complete;

public class ContainsDuplicate3 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length && j - i <= indexDiff; j++) {
                if (Math.abs(i - j) <= indexDiff && Math.abs(nums[i] - nums[j]) <= valueDiff) {
                    return true;
                }
            }
        }
        return false;
    }
}
