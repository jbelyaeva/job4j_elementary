package ru.job4j.array;

import java.util.Objects;

public class MatrixCheck {

  public static boolean monoHorizontal(char[][] board, int row) {
    boolean result = true;
    for (int i = 0; i < board.length; i++) {
      if (Objects.equals(board[row][i], "X")) {
        result = false;
        break;
      }
    }
    return result;
  }

  public static boolean monoVertical(char[][] board, int column) {
    boolean result = true;
    for (int i = 0; i < board.length; i++) {
      if (Objects.equals(board[i][column], "X")) {
        result = false;
        break;
      }
    }
    return result;
  }

  public static char[] extractDiagonal(char[][] board) {
    char[] rsl = new char[board.length];
    for (int i = 0; i < board.length; i++) {
      rsl[i] = board[i][i];
    }
    return rsl;
  }
}
