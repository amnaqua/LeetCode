package main.java.org.example.Algorithms.Easy.Attempted;

import java.util.HashSet;
import java.util.Set;

public class CountTheDigitsThatDivideANumber {
    public int countDigits(int num) {
        int save = num;
        int res = 0;
        int dig;
        Set<Integer> nums = new HashSet<>();
        while (save > 0) {
            dig = num % 10;
            if (num % dig == 0 && !nums.contains(dig)) {
                res++;
            }
            nums.add(dig);
            save /= 10;
        }
        return res;
    }
}
