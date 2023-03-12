package main.java.org.example.Algorithms.Easy.Attempted;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (!stack.isEmpty()) {
                if (stack.peek() == s.charAt(i)) {
                    System.out.println(stringBuilder.charAt(i) + " " + stringBuilder.charAt(i) + "\n");
                    stringBuilder.deleteCharAt(i);
                    System.out.println(stringBuilder.charAt(i) + " " + stringBuilder.charAt(i));
                    stringBuilder.deleteCharAt(i);
                    stack.pop();
                    i = 0;
                    continue;
                }
            }
            stack.push(s.charAt(i));
        }
        return new String(stringBuilder.reverse());
    }
}
