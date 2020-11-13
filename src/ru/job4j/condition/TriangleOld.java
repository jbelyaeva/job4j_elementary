package ru.job4j.condition;

public class TriangleOld {

  public static boolean exist(double ab, double ac, double bc) {
    return (ab + ac > bc) && (ac + bc > ab) && (ab + bc > ac);
  }
}
