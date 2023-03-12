package main.java.org.example.Algorithms.Medium.Attempted;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] parsed = s.split(" ");
        for (int i = 0; i < parsed.length; i++) {
            parsed[i] += " ";
        }
        for (int i = 0, j = parsed.length - 1; i < j; i++, j--) {
            String temp = parsed[i];
            parsed[i] = parsed[j];
            parsed[j] = temp;
        }
        String res = "";
        for (int i = 0; i < parsed.length; i++) {
            res += parsed[i];
        }
        return res;
    }
}
