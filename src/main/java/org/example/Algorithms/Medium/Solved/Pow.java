package main.java.org.example.Algorithms.Medium.Solved;

public class Pow {
    public double myPow(double x, int n) {
        double res = 1.0;
        long pow = n;
        if (n < 0) {
            pow = -1 * pow;
        }

        while (pow > 0) {
            if (pow % 2 == 1) {
                res = res * x;
                pow -= 1;
            }
            else {
                x = x * x;
                pow = pow / 2;
            }
        }
        if (n < 0) {
            return 1.0 / res;
        }
        return res;
    }
}
