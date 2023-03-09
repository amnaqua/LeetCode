package org.example.Algorithms.Medium.Complete;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if (len < 2) {
            return;
        }
        int[] res = new int [len];

        for (int i = 0; i < len; i++) {
            if (i + k >= len) {
                int pos = i + k;
                while (pos >= len) {
                    pos -= len;
                }
                res[pos] = nums[i];
            } else {
                res[i + k] = nums[i];
            }
        }
        System.arraycopy(res, 0, nums, 0, len);
    }
}
