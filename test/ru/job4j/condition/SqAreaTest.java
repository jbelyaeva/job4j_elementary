package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

  private double out(int p, int k) {
    return SqArea.square(p, k);
  }

  @Test
  public void whenp6k2then2() {
    int expected = 2;
    Assert.assertEquals(expected, out(6, 2), 0.01);
  }

  @Test
  public void whenp10k5then3() {
    int expected = 3;
    Assert.assertEquals(expected, out(10, 2), 0.01);
  }

  @Test
  public void whenp15k9then5() {
    int expected = 5;
    Assert.assertEquals(expected, out(15, 3), 0.01);
  }
}