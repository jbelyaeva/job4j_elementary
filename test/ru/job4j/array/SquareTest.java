package ru.job4j.array;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

  @Test
  public void whenBound3Then014() {
    int bound = 3;
    int[] rst = Square.calculate(bound);
    int[] expect = new int[] {0, 1, 4};
    assertThat(rst, is(expect));
  }

  @Test
  public void whenBound5Then014916() {
    int bound = 5;
    int[] rst = Square.calculate(bound);
    int[] expect = new int[] {0, 1, 4, 9, 16};
    assertThat(rst, is(expect));
  }

}