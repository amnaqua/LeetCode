package main.java.org.example.Algorithms.Easy.Solved;

public class MostFrequentEvenElement {
    private int smallest = Integer.MAX_VALUE, freq = 0;

    public int mostFrequentEven(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == nums[i]) {
                        counter++;
                    }
                }
                if (counter > freq) {
                    freq = counter;
                    smallest = nums[i];
                } else if (counter == freq) {
                    if (nums[i] < smallest) {
                        smallest = nums[i];
                    }
                }
                counter = 0;
            }
        }
        return smallest == Integer.MAX_VALUE ? -1 : smallest;
    }
}
