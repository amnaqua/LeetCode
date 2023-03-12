package main.java.org.example.Algorithms.Easy.Solved;

import java.util.ArrayList;
import java.util.List;

public class CellsInARangeOnAnExcelSheet {
    public List<String> cellsInRange(String s) {
        List<String> result = new ArrayList<>();
        String[] parsed = s.split(":");
        int numberOfColumns, numberOfRows;
        int maxCol = parsed[0].charAt(0), maxRow = parsed[0].charAt(1);
        int minCol = parsed[0].charAt(0), minRow = parsed[0].charAt(1);
        for (int i = 0; i < parsed.length; ++i) {
            if (parsed[i].charAt(1) > maxRow) {
                maxRow = parsed[i].charAt(1);
            }
            if (parsed[i].charAt(1) < minRow) {
                minRow = parsed[i].charAt(1);
            }
            if (parsed[i].charAt(0) > maxCol) {
                maxCol = parsed[i].charAt(0);
            }
            if (parsed[i].charAt(0) < minCol) {
                minCol = parsed[i].charAt(0);
            }
        }
        numberOfColumns = maxCol - minCol;
        numberOfRows = maxRow - minRow;

        for (int i = 0; i <= numberOfColumns; ++i) {
            String temp = "";
            for (int j = 0; j <= numberOfRows; ++j) {
                result.add(temp + (char) (minCol + i) + (char) (minRow + j));
            }
        }
        return result;
    }
}
