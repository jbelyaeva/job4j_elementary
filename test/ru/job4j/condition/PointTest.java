package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

  @Test
  public void when00to20then2() {
    int expected = 2;
    Point a = new Point(0, 0);
    Point b = new Point(2, 0);
    double out = a.distance(b);
    Assert.assertEquals(expected, out, 0.01);
  }

  @Test
  public void when45to78then4() {
    int expected = 4;
    Point a = new Point(4, 5);
    Point b = new Point(7, 8);
    double out = a.distance(b);
    Assert.assertEquals(expected, out, 0.9);
  }

  @Test
  public void when03to58then7() {
    int expected = 7;
    Point a = new Point(0, 3);
    Point b = new Point(5, 8);
    double out = a.distance(b);
    Assert.assertEquals(expected, out, 0.9);
  }

  @Test
  public void when222to416then4() {
    int expected = 4;
    Point a = new Point(2, 2, 2);
    Point b = new Point(4, 1, 6);
    double out = a.distance3d(b);
    Assert.assertEquals(expected, out, 0.9);
  }

  @Test
  public void when2negative22to41negative6then8() {
    int expected = 8;
    Point a = new Point(2, -2, 2);
    Point b = new Point(4, 1, -6);
    double out = a.distance3d(b);
    Assert.assertEquals(expected, out, 0.9);
  }
}