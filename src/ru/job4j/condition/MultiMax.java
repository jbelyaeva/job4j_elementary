package ru.job4j.condition;

public class MultiMax {

  public static int max(int first, int second, int third) {
    int res = (first >= second) ? first : second;
    return (res >= third) ? res : third;
  }
}