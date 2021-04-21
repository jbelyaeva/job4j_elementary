package ru.job4j.lambda;

import static java.lang.Math.pow;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class DiapasonTest {

  Diapason function = new Diapason();

  @Test
  public void whenLinearFunctionThenLinearResults() {
    List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
    List<Double> expected = Arrays.asList(11D, 13D, 15D);
    assertThat(result, is(expected));
  }

  @Test
  public void whenQuadraticFunctionThenLinearResults() {
    List<Double> result = function.diapason(5, 8, x -> 2 * pow((x - 1), 2) + 4);
    List<Double> expected = Arrays.asList(36D, 54D, 76D);
    assertThat(result, is(expected));
  }

  @Test
  public void whenExponentialFunctionThenLinearResults() {
    List<Double> result = function.diapason(2, 5, x -> pow(x, x) + 4);
    List<Double> expected = Arrays.asList(8D, 31D, 260D);
    assertThat(result, is(expected));
  }

}