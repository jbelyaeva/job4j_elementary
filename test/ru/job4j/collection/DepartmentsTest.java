package ru.job4j.collection;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class DepartmentsTest {

  @Test
  public void whenMissed() {
    List<String> input = List.of("k1/sk1");
    List<String> expect = List.of("k1", "k1/sk1");
    List<String> result = Departments.fillGaps(input);
    assertThat(result, is(expect));
  }

  @Test
  public void whenMissedNew() {
    List<String> input = List.of("k2/sk1/sk2", "k1/sk1");
    List<String> expect = List.of("k2", "k2/sk1", "k2/sk1/sk2", "k1", "k1/sk1");
    List<String> result = Departments.fillGaps(input);
    assertThat(result, is(expect));
  }

  @Test
  public void whenNonChange() {
    List<String> input = List.of("k1", "k1/sk1");
    List<String> expect = List.of("k1", "k1/sk1");
    List<String> result = Departments.fillGaps(input);
    assertThat(result, is(expect));
  }

  @Test
  public void sortAsc() {
    List<String> input = Arrays.asList("k2", "k2/sk1", "k1", "k1/sk1", "k2/sk1/sk2");
    List<String> result = Departments.sortAsc(input);
    List<String> expect = List.of("k1", "k1/sk1", "k2", "k2/sk1", "k2/sk1/sk2");
    assertThat(result, is(expect));
  }

  @Test
  public void sortDsc() {
    List<String> input = Arrays.asList("K1", "K1/SK1", "K2", "K2/SK1");
    List<String> result = Departments.sortDesc(input);
    List<String> expect = List.of("K2", "K2/SK1", "K1", "K1/SK1");
    assertThat(result, is(expect));
  }

  @Test
  public void sortDscBig() {
    List<String> input = Arrays.asList("K1", "K1/SK1", "K1/SK1/SSK1", "K1/SK1/SSK2", "K1/SK2",
        "K2", "K2/SK1", "K2/SK1/SSK1", "K2/SK1/SSK2");
    List<String> result = Departments.sortDesc(input);
    List<String> expect = List.of("K2", "K2/SK1", "K2/SK1/SSK1", "K2/SK1/SSK2", "K1", "K1/SK1",
        "K1/SK1/SSK1", "K1/SK1/SSK2", "K1/SK2");
    assertThat(result, is(expect));
  }
}