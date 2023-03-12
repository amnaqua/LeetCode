package main.java.org.example.Algorithms.Easy.Solved;

import java.util.ArrayList;
import java.util.Objects;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        ArrayList<Integer> nums = new ArrayList<>();
        while (x != 0) {
            nums.add(x % 10);
            x /= 10;
        }
        int size = nums.size();
        for (int i = 0, j = size - 1; i < size; i++, j--) {
            if (!Objects.equals(nums.get(i), nums.get(j))) {
                return false;
            }
        }
        return true;
    }
}
