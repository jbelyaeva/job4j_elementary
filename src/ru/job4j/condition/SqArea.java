package ru.job4j.condition;

public class SqArea {

  public static double square(int p, int k) {
    double h = p / (2 * (k + 1));
    double l = p * k / (2 * (k + 1));
    return l * h;
  }

  public static void main(String[] args) {
    System.out.println(" Если p = 6, k = 2, то s = 2. real = " + SqArea.square(6, 2));
  }

}
