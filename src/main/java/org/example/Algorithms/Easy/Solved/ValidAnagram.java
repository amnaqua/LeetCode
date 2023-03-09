package org.example.Algorithms.Easy.Solved;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] first = new char[256];
        char[] second = new char[256];

        for (int i = 0; i < s.length(); i++) {
            first[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            second[t.charAt(i)]++;
        }
        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }
        return true;
    }
}
