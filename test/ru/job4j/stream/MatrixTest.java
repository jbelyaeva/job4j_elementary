package ru.job4j.stream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;
import org.junit.Test;

public class MatrixTest {

  @Test
  public void whenArrayInResult() {
    Integer[][] startArray = {
        {1, 2, 3},
        {4, 5, 6},
        {1, 4, 5, 6}
    };
    List<Integer> rsl = Matrix.transform(startArray);
    List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 1, 4, 5, 6);
    assertThat(rsl, is(expected));
  }
}