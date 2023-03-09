package org.example.Algorithms.Medium.Complete;

public class Atoi {
    public int myAtoi(String s) {
        boolean flag = false;
        if (s.length() < 1) {
            return 0;
        }
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && s.charAt(i) != '+' && s.charAt(i) != '-' && !Character.isDigit(s.charAt(i))) {
                return 0;
            }
            while (s.charAt(i) == ' ' && i != s.length() - 1) {
                i++;
            }
            while (s.charAt(i) == '0' && i != s.length() - 1) {
                flag = true;
                i++;
            }
            if (s.charAt(i) == '-' || s.charAt(i) == '+' && i != s.length() - 1) {
                if (flag) {
                    return 0;
                }
                if (s.charAt(i) == '-') {
                    number.append('-');
                }
                i++;
            }
            if (i == s.length() || !Character.isDigit(s.charAt(i))) {
                return 0;
            }
            while (s.charAt(i) == '0' && i != s.length() - 1) {
                i++;
            }
            while (Character.isDigit(s.charAt(i)) && i != s.length() - 1) {
                number.append(s.charAt(i));
                i++;
            }
            if (i == s.length() - 1 && Character.isDigit(s.charAt(i))) {
                number.append(s.charAt(i));
            }
            if (!Character.isDigit(i) || i == s.length() - 1) {
                break;
            }
        }
        if (number.length() > 10 && Character.isDigit(number.charAt(0))) {
            return Integer.MAX_VALUE;
        }
        if (number.length() > 11 && number.charAt(0) == '-') {
            return Integer.MIN_VALUE;
        }
        long checker = Long.parseLong(number.toString());
        if (checker > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (checker < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) checker;
    }
}
