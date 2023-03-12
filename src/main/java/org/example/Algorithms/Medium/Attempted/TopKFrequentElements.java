package main.java.org.example.Algorithms.Medium.Attempted;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(arr, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[256];
        int[] res = new int[k];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        Arrays.sort(arr);
        for (int i = 255, j = 0; k > 0 && i > 0; i--) {
            if (arr[i] != 0) {
                res[j] = Math.abs(i - 256);
                k--;
                j++;
            }
        }
        return res;
    }
}
