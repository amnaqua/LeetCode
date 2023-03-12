package main.java.org.example.Algorithms.Easy.Solved;

public class ToLowerCase {
    public String toLowerCase(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                res += (char) (s.charAt(i) + 32);
                continue;
            }
            res += s.charAt(i);
        }
        return res;
    }
}
