package ru.job4j.array;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class UnionSortLoopTest {

  @Test
  public void whenUnionValues() {
    int[] mas1 = new int[]{0, 1, 2};
    int[] mas2 = new int[]{1, 2, 3};
    int[] result = UnionSortLoop.union(mas1, mas2);
    int[] expect = new int[]{0, 1, 1, 2, 2, 3};
    assertThat(result, is(expect));
  }

  @Test
  public void whenLoopSimilar() {
    int[] mas1 = new int[]{0, 1, 2};
    int[] mas2 = new int[]{0, 1, 2};
    int[] result = UnionSortLoop.union(mas1, mas2);
    int[] expect = new int[]{0, 0, 1, 1, 2, 2};
    assertThat(result, is(expect));
  }

  @Test
  public void whenLoopDifferent() {
    int[] mas1 = new int[]{0, 1, 2};
    int[] mas2 = new int[]{3, 4, 5};
    int[] result = UnionSortLoop.union(mas1, mas2);
    int[] expect = new int[]{0, 1, 2, 3, 4, 5};
    assertThat(result, is(expect));
  }

  @Test
  public void whenLoop() {
    int[] mas1 = new int[]{5, 6, 7};
    int[] mas2 = new int[]{0, 1, 2};
    int[] result = UnionSortLoop.union(mas1, mas2);
    int[] expect = new int[]{0, 1, 2, 5, 6, 7};
    assertThat(result, is(expect));
  }

  @Test
  public void whenLoop1() {
    int[] mas1 = new int[]{5, 6, 7};
    int[] mas2 = new int[]{0, 1, 5};
    int[] result = UnionSortLoop.union(mas1, mas2);
    int[] expect = new int[]{0, 1, 5, 5, 6, 7};
    assertThat(result, is(expect));
  }

  @Test
  public void whenLoop2() {
    int[] mas1 = new int[]{1, 7, 9, 15, 20};
    int[] mas2 = new int[]{0, 100, 200};
    int[] result = UnionSortLoop.union(mas1, mas2);
    int[] expect = new int[]{0, 1, 7, 9, 15, 20, 100, 200};
    assertThat(result, is(expect));
  }

}