package main.java.org.example.Algorithms.Hard.Solved;

import java.util.ArrayList;
import java.util.Collections;

public class MedianOfTwoSortedArrays {
    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int j : nums1) {
            arr.add(j);
        }
        for (int j : nums2) {
            arr.add(j);
        }
        Collections.sort(arr);
        if (arr.size() % 2 == 0) {
            return (double) (arr.get(arr.size() / 2 - 1) + arr.get(arr.size() / 2)) / 2;
        } else {
            return (double) (arr.get(arr.size() / 2));
        }
    }
}
