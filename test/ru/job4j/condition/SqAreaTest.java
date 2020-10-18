package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

  @Test
  public void whenp6k2then2() {
    int expected = 2;
    int p = 6;
    int k = 2;
    double out = SqArea.square(p, k);
    Assert.assertEquals(expected, out, 0.01);
  }

  @Test
  public void whenp10k2then3() {
    int expected = 3;
    int p = 10;
    int k = 2;
    double out = SqArea.square(p, k);
    Assert.assertEquals(expected, out, 0.01);
  }

  @Test
  public void whenp15k3then5() {
    int expected = 5;
    int p = 15;
    int k = 3;
    double out = SqArea.square(p, k);
    Assert.assertEquals(expected, out, 0.01);
  }
}