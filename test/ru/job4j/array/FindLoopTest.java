package ru.job4j.array;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class FindLoopTest {

  @Test
  public void whenArrayHas5Then0() {
    int input[] = {5, 4, 3, 2};
    int value = 5;
    int result = FindLoop.indexOf(input, value);
    int expect = 0;
    assertThat(result, is(expect));
  }

  @Test
  public void whenArrayHas3Then2() {
    int input[] = {5, 4, 3, 2};
    int value = 3;
    int result = FindLoop.indexOf(input, value);
    int expect = 2;
    assertThat(result, is(expect));
  }
}