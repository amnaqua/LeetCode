package org.example.Algorithms.Medium.Attempted;

import java.util.Arrays;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        boolean res = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                res = isValidCell(board, j, i);
                if (!res) {
                    return false;
                }
            }
        }
        return res && isValidSquares(board);
    }

    private static boolean isValidCell(char[][] board, int x, int y) {
        for (int j = 0; j < 9; j++) {
            if (board[y][j] == board[y][x] && x != j && board[x][y] != '.') {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (board[i][x] == board[x][y] && y != i && board[x][y] != '.') {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidSquares(char[][] board) {
        int[] squareSymbols = new int[9];
        for (int i = 1; i < 8; i += 3) {
            for (int j = 1; j < 8; j += 3) {
                squareSymbols[0] = board[i - 1][j - 1];
                squareSymbols[1] = board[i - 1][j];
                squareSymbols[2] = board[i - 1][j + 1];
                squareSymbols[3] = board[i][j - 1];
                squareSymbols[4] = board[i][j];
                squareSymbols[5] = board[i][j + 1];
                squareSymbols[6] = board[i + 1][j - 1];
                squareSymbols[7] = board[i + 1][j];
                squareSymbols[8] = board[i + 1][j + 1];
                if (!isNoDuplicatesInArray(squareSymbols)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isNoDuplicatesInArray(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < 8; i++) {
            if (arr[i] == arr[i + 1] && arr[i] != '.') {
                return false;
            }
        }
        return true;
    }
}
