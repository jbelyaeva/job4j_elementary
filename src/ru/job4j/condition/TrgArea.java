package ru.job4j.condition;

import static java.lang.StrictMath.sqrt;

public class TrgArea {

  public static double area(double a, double b, double c) {
    double p = (a + b + c) / 2;
    return sqrt(p * (p - a) * (p - b) * (p - c));
  }

  public static void main(String[] args) {
    System.out.println("area (2, 2, 2) = " + TrgArea.area(2, 2, 2));
  }

}
