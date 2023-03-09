package org.example.Algorithms.Easy.Solved;

import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> dic = new HashMap<>();
        fillDictionary(dic);
        int res = 0;

        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");

        for (int i = 0; i < s.length(); i++) {
            res += dic.get(s.charAt(i));
        }
        return res;
    }

    private static void fillDictionary(HashMap<Character, Integer> dic) {
        dic.put('I', 1);
        dic.put('V', 5);
        dic.put('X', 10);
        dic.put('L', 50);
        dic.put('C', 100);
        dic.put('D', 500);
        dic.put('M', 1000);
    }
}
