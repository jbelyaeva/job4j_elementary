package ru.job4j.loop;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

  @Test
  public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
    int rsl = Factorial.calc(5);
    int expected = 120;
    assertThat(rsl, is(expected));
  }

  @Test
  public void whenCalculateFactorialForZeroThenOne() {
    int rsl = Factorial.calc(0);
    int expected = 1;
    assertThat(rsl, is(expected));
  }
}