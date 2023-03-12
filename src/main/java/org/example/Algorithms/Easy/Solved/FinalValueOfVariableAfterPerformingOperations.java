package main.java.org.example.Algorithms.Easy.Solved;

public class FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            if (operation.contains("--X")) {
                --x;
            } else if (operation.contains("++X")) {
                ++x;
            } else if (operation.contains("X++")) {
                x++;
            } else if (operation.contains("X--")) {
                x--;
            }
        }
        return x;
    }
}
