package main.java.org.example.Algorithms.Easy.Solved;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            int counter = 0;
            for (int j = 0; i + counter < haystack.length()
                    && haystack.charAt(i + counter) == needle.charAt(j); j++) {
                if (j == needle.length() - 1) {
                    return i;
                }
                counter++;
            }
        }
        return -1;
    }
}
