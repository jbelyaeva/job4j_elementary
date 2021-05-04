package ru.job4j.collection;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class ConvertList2ArrayTest {
  @Test
  public void when7ElementsThen9() {
    ConvertList2Array list = new ConvertList2Array();
    int[][] result = list.toArray(
        List.of(1, 2, 3, 4, 5, 6, 7),
        3
    );
    int[][] expect = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 0, 0}
    };
    assertThat(result, is(expect));
  }

  @Test
  public void when13ElementsThen18() {
    ConvertList2Array list = new ConvertList2Array();
    int[][] result = list.toArray(
        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
        6
    );
    int[][] expect = {
        {1, 2, 3, 4, 5, 6},
        {7, 8, 9, 10, 11, 12},
        {13, 0, 0, 0, 0, 0}
    };
    assertThat(result, is(expect));
  }
}