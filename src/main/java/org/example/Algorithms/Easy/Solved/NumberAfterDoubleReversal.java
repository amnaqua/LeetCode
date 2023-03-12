package main.java.org.example.Algorithms.Easy.Solved;

public class NumberAfterDoubleReversal {
    public boolean isSameAfterReversals(int num) {
        if (num < 10) {
            return true;
        } else return num % 10 != 0;
    }
}
