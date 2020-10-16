package ru.job4j.condition;

import static java.lang.StrictMath.pow;

public class SqArea {

  public static double square(int p, int k) {
    return k * pow(p, 2) / (4 * pow((k + 1), 2));
  }

  public static void main(String[] args) {
    System.out.println(" Если p = 6, k = 2, то s = 2. real = " + SqArea.square(6, 2));
  }

}
