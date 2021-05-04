package ru.job4j.collection;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class ConvertListTest {
  @Test
  public void whenTwoList() {
    List<int[]> in = new ArrayList<>();
    in.add(new int[] {1});
    in.add(new int[] {2, 3});
    List<Integer> expect = List.of(1, 2, 3);
    assertThat(ConvertList.convert(in), is(expect));
  }

  @Test
  public void whenThreeList() {
    List<int[]> in = new ArrayList<>();
    in.add(new int[] {1});
    in.add(new int[] {2, 3, 4, 5});
    in.add(new int[] {6, 7, 8});
    List<Integer> expect = List.of(1, 2, 3, 4, 5, 6, 7, 8);
    assertThat(ConvertList.convert(in), is(expect));
  }
}