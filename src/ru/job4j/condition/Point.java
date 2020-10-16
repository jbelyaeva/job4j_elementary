package ru.job4j.condition;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

public class Point {

  public static double distance(int x1, int y1, int x2, int y2) {
    return sqrt(pow((x2-x1),2)+ pow((y2-y1),2));
  }

  public static void main(String[] args) {
    System.out.println("result (0, 0) to (2, 0) = " + Point.distance(0, 0, 2, 0));
  }

}
