package main.java.org.example.Algorithms.Easy.Solved;

public class MaximumNumberOfWordsFoundInSentences {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            String[] temp = sentences[i].split(" ");
            if (temp.length > max) {
                max = temp.length;
            }
        }
        return max;
    }
}
