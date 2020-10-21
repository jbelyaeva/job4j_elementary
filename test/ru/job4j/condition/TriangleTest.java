package ru.job4j.condition;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
  @Test
  public void whenExist() {
    boolean result = Triangle.exist(2.0, 2.0, 2.0);
    assertThat(result, is(true));
  }

  @Test
  public void whenNotExist() {
    boolean result = Triangle.exist(10.0, 2.0, 2.0);
    assertThat(result, is(false));
  }
}