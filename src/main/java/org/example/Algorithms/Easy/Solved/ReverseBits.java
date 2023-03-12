package main.java.org.example.Algorithms.Easy.Solved;

public class ReverseBits {
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int lsb = n & 1;
            int revLsb = lsb << (31 - i);
            res = res | revLsb;
            n = n >> 1;
        }
        return res;
    }
}
