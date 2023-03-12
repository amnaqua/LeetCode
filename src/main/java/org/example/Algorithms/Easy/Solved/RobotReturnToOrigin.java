package main.java.org.example.Algorithms.Easy.Solved;

public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int x_pos = 0;
        int y_pos = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'R') {
                x_pos += 1;
            } else if (moves.charAt(i) == 'L') {
                x_pos -= 1;
            } else if (moves.charAt(i) == 'U') {
                y_pos += 1;
            } else if (moves.charAt(i) == 'D') {
                y_pos -= 1;
            }
        }
        return x_pos == 0 && y_pos == 0;
    }
}
