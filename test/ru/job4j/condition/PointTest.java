package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

  @Test
  public void when00to20then2() {
    int expected = 2;
    int x1 = 0;
    int y1 = 0;
    int x2 = 2;
    int y2 = 0;
    double out = Point.distance(x1, y1, x2, y2);
    Assert.assertEquals(expected, out, 0.01);
  }

  @Test
  public void when45to78then4() {
    int expected = 4;
    int x1 = 4;
    int y1 = 5;
    int x2 = 7;
    int y2 = 8;
    double out = Point.distance(x1, y1, x2, y2);
    Assert.assertEquals(expected, out, 0.9);
  }

  @Test
  public void when03to58then7() {
    int expected = 7;
    int x1 = 0;
    int y1 = 3;
    int x2 = 5;
    int y2 = 8;
    double out = Point.distance(x1, y1, x2, y2);
    Assert.assertEquals(expected, out, 0.9);
  }
}