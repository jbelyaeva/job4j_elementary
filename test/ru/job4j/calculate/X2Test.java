package ru.job4j.calculate;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {

  private int rsl(int a, int b, int c, int x) {
    return X2.calc(a, b, c, x);
  }

  @Test
  public void whenA10B0C0X2Then40() {
    int expected = 40;
    Assert.assertEquals(expected, rsl(10, 0, 0, 2));
  }

  @Test
  public void whenA1B1C1X1Then3() {
    int expected = 3;
    Assert.assertEquals(expected, rsl(1, 1, 1, 1));
  }

  @Test
  public void whenA0B1C1X1Then2() {
    int expected = 2;
    Assert.assertEquals(expected, rsl(0, 1, 1, 1));
  }

  @Test
  public void whenA1B1C0X1Then2() {
    int expected = 2;
    Assert.assertEquals(expected, rsl(1, 1, 0, 1));
  }

  @Test
  public void whenA1B1C1X0Then1() {
    int expected = 1;
    Assert.assertEquals(expected, rsl(1, 1, 1, 0));
  }

}