package main.java.org.example.Algorithms.Medium.Attempted;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length - 1; i < j;) {
            if (Math.abs(height[i] - height[j]) * (j - i) > max) {
                max = Math.abs(height[i] - height[j]) * Math.abs(i - j);
            }
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return max;
    }
}
