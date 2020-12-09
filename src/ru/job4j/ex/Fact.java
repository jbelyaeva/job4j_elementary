package ru.job4j.ex;

public class Fact {

  private static int calc(int n) {
    int rsl = 1;
    if (n < 0) {
      throw new IllegalArgumentException("not allowed if n<0");
    }
    for (int index = 1; index <= n; index++) {
      rsl *= index;
    }
    return rsl;
  }

  public static void main(String[] args) {
    System.out.println(calc(8));
  }
}
