package main.java.org.example.Algorithms.Medium.Solved;

public class ReverseInteger {
    public int reverse(int x) {
        long temp = x;
        boolean negative = false;
        if (temp < 0) {
            temp *= -1;
            negative = true;
        }
        StringBuilder stringBuilder = new StringBuilder(Long.toString(temp));
        stringBuilder.reverse();
        if (stringBuilder.length() > 10 && !negative && stringBuilder.charAt(0) > '2') {
            return 0;
        } else if (stringBuilder.length() > 10 && negative && stringBuilder.charAt(0) > '2') {
            return 0;
        }
        if (stringBuilder.length() == 10) {
            temp = Long.parseLong(stringBuilder.toString());
            if (temp > Integer.MAX_VALUE) {
                return 0;
            }
        }
        return negative ? Integer.parseInt(stringBuilder.toString()) * -1 : Integer.parseInt(stringBuilder.toString());
    }
}
