package ru.job4j.array;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MatrixCheckTest {

  @Test
  public void whenHasMonoHorizontalTrue() {
    char[][] input = {
        {' ', ' ', ' '},
        {'X', 'X', 'X'},
        {' ', ' ', ' '},
    };
    boolean result = MatrixCheck.monoHorizontal(input, 1);
    assertThat(result, is(true));
  }

  @Test
  public void whenHasMonoHorizontalFalse() {
    char[][] input = {
        {' ', ' ', ' '},
        {'X', 'X', 'X'},
        {' ', ' ', ' '},
    };
    boolean result = MatrixCheck.monoHorizontal(input, 2);
    assertThat(result, is(true));
  }

  @Test
  public void whenHasMonoVertical() {
    char[][] input = {
        {' ', ' ', 'X'},
        {' ', ' ', 'X'},
        {' ', ' ', 'X'},
    };
    boolean result = MatrixCheck.monoVertical(input, 2);
    assertThat(result, is(true));
  }
}