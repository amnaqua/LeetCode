package main.java.org.example.Algorithms.Easy.Solved;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0 || nums.length == 0) {
            return false;
        }
        int dist;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; Math.abs(i - j) <= k && j < len; j++) {
                if (nums[i] == nums[j] && i != j) {
                    dist = Math.abs(i - j);
                    if (dist <= k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
