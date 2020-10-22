package ru.job4j.loop;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class CounterTest {

  @Test
  public void whenSumEvenNumbersFromOneToTenThenThirty() {
    int rsl = Counter.sumByEven(1, 10);
    int expected = 30;
    assertThat(rsl, is(expected));
  }

  @Test
  public void whenSumEvenNumbersFrom10To28Then190() {
    int rsl = Counter.sumByEven(10, 28);
    int expected = 190;
    assertThat(rsl, is(expected));
  }

  @Test
  public void whenSumEvenNumbersFromNegativ10To4Then190() {
    int rsl = Counter.sumByEven(-10, 4);
    int expected = -24;
    assertThat(rsl, is(expected));
  }
}