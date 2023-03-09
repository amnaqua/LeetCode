package org.example.Algorithms.Easy.Solved;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfString {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        Set<Character> dic = new HashSet<>();
        fillDictionary(dic);
        for (int i = 0, j = s.length() - 1; i < j;) {
            if (!checker(arr[i], dic)) {
                i++;
                continue;
            }
            if (!checker(arr[j], dic)) {
                j--;
                continue;
            }
            if (checker(arr[i], dic) && checker(arr[j], dic)) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        String res = "";
        for (char c : arr) {
            res += c;
        }
        return res;
    }

    private static void fillDictionary(Set<Character> dic) {
        dic.add('a');
        dic.add('A');
        dic.add('o');
        dic.add('O');
        dic.add('i');
        dic.add('I');
        dic.add('e');
        dic.add('E');
        dic.add('u');
        dic.add('U');
    }

    private static boolean checker(char ch, Set<Character> dic) {
        return dic.contains(ch);
    }
}
