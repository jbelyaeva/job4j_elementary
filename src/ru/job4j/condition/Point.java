package ru.job4j.condition;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

public class Point {

  private int x;
  private int y;
  private int z;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Point(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public double distance(Point that) {
    return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
  }

  public double distance3d(Point that) {
    return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
  }

  public void info() {
    System.out.println(String.format("Point[%s, %s]", this.x, this.y));
  }

  public void info3d() {
    System.out.println(String.format("Point[%s, %s, %s]", this.x, this.y, this.z));
  }

  public static void main(String[] args) {
    Point a = new Point(0, 0, 7);
    Point b = new Point(0, 2, 8);
    a.info3d();
    b.info3d();
    System.out.print("Расстояние между этими точками: ");
    double dist = a.distance3d(b);
    System.out.println(dist);
  }

}
