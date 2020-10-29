package ru.job4j.array;

import java.util.Objects;

public class MatrixCheck {

  public static boolean monoHorizontal(char[][] board, int row) {
    boolean result = true;
    for (int i = 0; i < board.length; i++) {
      char a = board[row][i];
      if (Objects.equals(a, "X")) {
        result = false;
        break;
      }
    }
    return result;
  }
}
