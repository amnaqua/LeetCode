package main.java.org.example.Algorithms.Medium.Solved;

import java.util.*;

public class MyCalendar1 {
    TreeMap<Integer, Integer> calendar = new TreeMap<>();

    public MyCalendar1() {
        calendar.put(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public boolean book(int start, int end) {
        Map.Entry<Integer, Integer> pair = calendar.higherEntry(start);
        boolean res = end <= pair.getValue();
        if (res) {
            calendar.put(end, start);
        }
        return res;
    }
}
