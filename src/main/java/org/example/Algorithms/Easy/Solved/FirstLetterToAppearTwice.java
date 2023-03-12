package main.java.org.example.Algorithms.Easy.Solved;

public class FirstLetterToAppearTwice {
    public char repeatedCharacter(String s) {
        int savePos = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (j == i) {
                    continue;
                }
                if (s.charAt(j) == s.charAt(i) && j > i) {
                    if (j < savePos) {
                        savePos = j;
                    }
                }
            }
        }
        return s.charAt(savePos);
    }
}
