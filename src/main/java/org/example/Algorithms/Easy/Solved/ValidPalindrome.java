package org.example.Algorithms.Easy.Solved;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String copy = "";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (Character.isLetter(ch) || Character.isDigit(ch)) {
                copy += ch;
            }
        }
        copy = copy.toLowerCase();
        for (int i = 0, j = copy.length() - 1; i < j; i++, j--) {
            ch = copy.charAt(i);
            if (copy.charAt(j) != ch) {
                return false;
            }
        }
        return true;
    }
}
