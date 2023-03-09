package org.example.Algorithms.Easy.Attempted;

import java.util.ArrayList;

public class RemoveLetterToEqualizeFrequency {
    public boolean equalFrequency(String word) {
        int[] arr = new int[256];
        for (int i = 0; i < word.length(); i++) {
            arr[word.charAt(i)]++;
        }
        ArrayList<Integer> set = new ArrayList<>();
        for (int j : arr) {
            if (j != 0) {
                set.add(j);
            }
        }
        for (int i = 0; i < set.size(); i++) {
            set.set(i, set.get(i) - 1);
            for (int j = 0; j < set.size() - 1; j++) {
                if (j == i) {
                    continue;
                }
                if (!set.get(j).equals(set.get(j + 1))) {
                    break;
                } else if (set.get(j).equals(set.get(j + 1)) && j == set.size() - 1) {
                    return true;
                }
            }
            set.set(i, set.get(i) + 1);
        }
        return false;
    }
}
