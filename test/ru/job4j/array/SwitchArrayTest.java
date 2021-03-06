package ru.job4j.array;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SwitchArrayTest {

  @Test
  public void whenSwap0to3() {
    int[] input = {1, 2, 3, 4};
    int[] expect = {4, 2, 3, 1};
    int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
    assertThat(rsl, is(expect));
  }

}