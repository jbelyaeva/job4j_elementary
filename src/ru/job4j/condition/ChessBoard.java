package ru.job4j.condition;

import static java.lang.StrictMath.abs;

public class ChessBoard {

  public static int way(int x1, int y1, int x2, int y2) {
    return abs(x1 - x2) == abs(y1 - y2) ? Math.abs(x2 - x1) : 0;
  }
}