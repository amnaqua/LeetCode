package main.java.org.example.Algorithms.Easy.Solved;

import java.util.HashSet;
import java.util.Set;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        if (s.length() == 1) {
            return 0;
        }
        Set<Character> dic = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (dic.contains(s.charAt(i))) {
                continue;
            }
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(i) && i != j) {
                    break;
                }
                if (s.charAt(j) != s.charAt(i) && j + 1 == s.length() || i == j && i == s.length() - 1) {
                    return i;
                }
            }
            dic.add(s.charAt(i));
        }
        return -1;
    }
}
