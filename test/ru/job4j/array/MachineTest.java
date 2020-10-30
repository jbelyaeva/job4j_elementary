package ru.job4j.array;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MachineTest {

  @Test
  public void whenEquals() {
    Machine machine = new Machine();
    int[] expected = {};
    int[] rsl = machine.change(100, 100);
    assertThat(rsl, is(expected));
  }

  @Test
  public void when50by35() {
    Machine machine = new Machine();
    int[] expected = {10, 5};
    int[] rsl = machine.change(50, 35);
    assertThat(rsl, is(expected));
  }

  @Test
  public void when100by35() {
    Machine machine = new Machine();
    int[] expected = {10, 10, 10, 10, 10, 10, 5};
    int[] rsl = machine.change(100, 35);
    assertThat(rsl, is(expected));
  }

  @Test
  public void when100by34() {
    Machine machine = new Machine();
    int[] expected = {10, 10, 10, 10, 10, 10, 5, 1};
    int[] rsl = machine.change(100, 34);
    assertThat(rsl, is(expected));
  }

  @Test
  public void when100by56() {
    Machine machine = new Machine();
    int[] expected = {10, 10, 10, 10, 2, 2};
    int[] rsl = machine.change(100, 56);
    assertThat(rsl, is(expected));
  }
}