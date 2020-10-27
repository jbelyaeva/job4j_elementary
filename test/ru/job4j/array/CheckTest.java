package ru.job4j.array;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class CheckTest {

  @Test
  public void whenDataMonoByTrueThenTrue() {
    boolean[] input = new boolean[] {true, true, true};
    boolean result = Check.mono(input);
    assertThat(result, is(true));
  }

  @Test
  public void whenDataNotMonoByTrueThenFalse() {
    boolean[] input = new boolean[] {true, false, true};
    boolean result = Check.mono(input);
    assertThat(result, is(false));
  }
}