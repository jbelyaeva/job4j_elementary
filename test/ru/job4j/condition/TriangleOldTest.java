package ru.job4j.condition;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleOldTest {
  @Test
  public void whenExist() {
    boolean result = TriangleOld.exist(2.0, 2.0, 2.0);
    assertThat(result, is(true));
  }

  @Test
  public void whenNotExist() {
    boolean result = TriangleOld.exist(10.0, 2.0, 2.0);
    assertThat(result, is(false));
  }
}