package main.java.org.example.Algorithms.Medium.Solved;

public class SortCharacterByFrequency {
    public String frequencySort(String s) {
        int[] arr = new int[256];

        for (char ch : s.toCharArray()) {
            arr[ch]++;
        }

        char[] c = new char[s.length()];

        for (int i = 0; i < s.length();) {
            int max = 0;
            int index = 0;
            for (int j = 0; j < 256; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    index = j;
                }
            }
            while (arr[index] > 0) {
                c[i++] = (char) index;
                arr[index]--;
            }
        }
        return new String(c);
    }
}
