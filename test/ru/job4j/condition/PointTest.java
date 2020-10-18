package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

  private double out(int x1, int y1, int x2, int y2) {
    return Point.distance(x1, y1, x2, y2);
  }

  @Test
  public void when00to20then2() {
    int expected = 2;
    Assert.assertEquals(expected, out(0, 0, 2, 0), 0.01);
  }

  @Test
  public void when45to78then4() {
    int expected = 4;
    Assert.assertEquals(expected, out(4, 5, 7, 8), 0.9);
  }

  @Test
  public void when03to58then7() {
    int expected = 7;
    Assert.assertEquals(expected, out(0, 3, 5, 8), 0.9);
  }
}