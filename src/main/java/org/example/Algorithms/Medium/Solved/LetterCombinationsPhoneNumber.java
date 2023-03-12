package main.java.org.example.Algorithms.Medium.Solved;

import java.util.*;

public class LetterCombinationsPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();

        if (digits.length() == 0) {
            return res;
        }

        List<Integer> allDigits = getDigits(digits);
        HashMap<Integer, String> dic = new HashMap<>();
        int digCount = allDigits.size();

        fillMap(dic);

        if (digCount == 1) {
            String symStr = dic.get(allDigits.get(0));
            res.add(String.valueOf(symStr.charAt(0)));
            res.add(String.valueOf(symStr.charAt(1)));
            res.add(String.valueOf(symStr.charAt(2)));
            if (allDigits.get(0) == 7 || allDigits.get(0) == 9) {
                res.add(String.valueOf(symStr.charAt(3)));
            }
            return res;
        } else if (digCount == 2) {
            String symStr1 = dic.get(allDigits.get(0));
            String symStr2 = dic.get(allDigits.get(1));
            int len1 = symStr1.length();
            int len2 = symStr2.length();
            for (int i = 0; i < len1; i++) {
                for (int j = 0; j < len2; j++) {
                    res.add(String.valueOf(symStr1.charAt(i)) + String.valueOf(symStr2.charAt(j)));
                }
            }
            return res;
        } else if (digCount == 3) {
            String symStr1 = dic.get(allDigits.get(0));
            String symStr2 = dic.get(allDigits.get(1));
            String symStr3 = dic.get(allDigits.get(2));
            int len1 = symStr1.length();
            int len2 = symStr2.length();
            int len3 = symStr3.length();
            for (int i = 0; i < len1; i++) {
                for (int j = 0; j < len2; j++) {
                    for (int k = 0; k < len3; k++) {
                        res.add(String.valueOf(symStr1.charAt(i))
                                + String.valueOf(symStr2.charAt(j))
                                + String.valueOf(symStr3.charAt(k)));
                    }
                }
            }
            return res;
        } else if (digCount == 4) {
            String symStr1 = dic.get(allDigits.get(0));
            String symStr2 = dic.get(allDigits.get(1));
            String symStr3 = dic.get(allDigits.get(2));
            String symStr4 = dic.get(allDigits.get(3));
            int len1 = symStr1.length();
            int len2 = symStr2.length();
            int len3 = symStr3.length();
            int len4 = symStr4.length();
            for (int i = 0; i < len1; i++) {
                for (int j = 0; j < len2; j++) {
                    for (int k = 0; k < len3; k++) {
                        for (int l = 0; l < len4; l++) {
                            res.add(String.valueOf(symStr1.charAt(i))
                                    + String.valueOf(symStr2.charAt(j))
                                    + String.valueOf(symStr3.charAt(k))
                                    + String.valueOf(symStr4.charAt(l)));
                        }
                    }
                }
            }
            return res;
        }
        return res;
    }

    private static void fillMap(HashMap<Integer, String> dic) {
        dic.put(2, "abc");
        dic.put(3, "def");
        dic.put(4, "ghi");
        dic.put(5, "jkl");
        dic.put(6, "mno");
        dic.put(7, "pqrs");
        dic.put(8, "tuv");
        dic.put(9, "wxyz");
    }

    private static List<Integer> getDigits(String digits) {
        int number = Integer.parseInt(digits);
        List<Integer> nums = new ArrayList<>();
        while (number != 0) {
            nums.add(number % 10);
            number /= 10;
        }
        Collections.reverse(nums);
        return nums;
    }
}
