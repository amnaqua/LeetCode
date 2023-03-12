package main.java.org.example.Algorithms.Medium.Solved;

public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        int sum = 0;
        int aPlus = (int) Math.log10(Math.pow(10, 150) * Math.pow(10, 0));
        int bPlus = (int) Math.log10(Math.pow(10, 0) * Math.pow(10, 150));
        while (a >= 150) {
            sum += aPlus;
            a -= 150;
        }
        while (a < -150) {
            sum += -aPlus;
            a += 150;
        }
        while (b > 150) {
            sum += bPlus;
            b -= 150;
        }
        while (b < 150) {
            sum += -bPlus;
            b += 150;
        }
        sum += (int) Math.log10(Math.pow(10, a) * Math.pow(10, b));
        return sum;
    }
}
