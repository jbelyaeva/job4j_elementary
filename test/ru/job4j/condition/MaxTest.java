package ru.job4j.condition;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class MaxTest {
  @Test
  public void whenMax1To2Then2() {
    int result = Max.max(1, 2);
    assertThat(result, is(2));
  }

  @Test
  public void whenMax2To5Then5() {
    int result = Max.max(2, 5);
    assertThat(result, is(5));
  }

  @Test
  public void whenMax2To2Then2() {
    int result = Max.max(2, 2);
    assertThat(result, is(2));
  }
}