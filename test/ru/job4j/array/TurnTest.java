package ru.job4j.array;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TurnTest {

  @Test
  public void whenTurn4162to2614() {
    int[] input = {4, 1, 6, 2};
    int[] expect = {2, 6, 1, 4};
    int[] rsl = Turn.back(input);
    assertThat(rsl, is(expect));
  }

  @Test
  public void whenTurn12345to54321() {
    int[] input = {1, 2, 3, 4, 5};
    int[] expect = {5, 4, 3, 2, 1};
    int[] rsl = Turn.back(input);
    assertThat(rsl, is(expect));
  }

  @Test
  public void whenTurn123456to654321() {
    int[] input = {1, 2, 3, 4, 5, 6};
    int[] expect = {6, 5, 4, 3, 2, 1};
    int[] rsl = Turn.back(input);
    assertThat(rsl, is(expect));
  }

  @Test
  public void whenTurn123456789to987654321() {
    int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] expect = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    int[] rsl = Turn.back(input);
    assertThat(rsl, is(expect));
  }
}