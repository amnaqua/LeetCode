package main.java.org.example.Algorithms.Easy.Attempted;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder stringBuilder1 = new StringBuilder(s);
        StringBuilder stringBuilder2 = new StringBuilder(t);
        int len1 = stringBuilder1.length();
        int len2 = stringBuilder2.length();

        for (int i = 0; i < len1 - 1; i++) {
            if (stringBuilder1.charAt(i) == '#') {
                if (i != 0) {
                    stringBuilder1.delete(i - 1, i);
                    len1 -=2;
                } else {
                    stringBuilder1.delete(i, i);
                    len1--;
                }
            }
        }
        for (int i = 0; i < len2 - 1; i++) {
            if (stringBuilder2.charAt(i) == '#') {
                if (i != 0) {
                    stringBuilder2.delete(i - 1, i);
                    len1 -=2;
                    i--;
                } else {
                    stringBuilder2.delete(i, i);
                    len1--;
                }
            }
        }
        return stringBuilder1.equals(stringBuilder2);
    }
}
