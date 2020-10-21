package ru.job4j.condition;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class MultiMaxTest {
  @Test
  public void whenFirstMax() {
    int result = MultiMax.max(10, 4, 2);
    assertThat(result, is(10));
  }

  @Test
  public void whenSecondMax() {
    int result = MultiMax.max(1, 4, 2);
    assertThat(result, is(4));
  }

  @Test
  public void whenThirdMax() {
    int result = MultiMax.max(1, 4, 8);
    assertThat(result, is(8));
  }

  @Test
  public void whenSame() {
    int result = MultiMax.max(1, 1, 1);
    assertThat(result, is(1));
  }
}