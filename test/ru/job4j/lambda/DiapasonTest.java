package ru.job4j.lambda;

import static java.lang.Math.pow;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class DiapasonTest {

  @Test
  public void whenLinearFunctionThenLinearResults() {
    List<Double> result = Diapason.diapason(5, 8, x -> 2 * x + 1);
    List<Double> expected = Arrays.asList(11D, 13D, 15D);
    assertThat(result, is(expected));
  }

  @Test
  public void whenQuadraticFunctionThenLinearResults() {
    List<Double> result = Diapason.diapason(5, 8, x -> 2 * pow((x - 1), 2) + 4);
    List<Double> expected = Arrays.asList(36D, 54D, 76D);
    assertThat(result, is(expected));
  }

  @Test
  public void whenExponentialFunctionThenLinearResults() {
    List<Double> result = Diapason.diapason(2, 5, x -> pow(2, x) + 4);
    List<Double> expected = Arrays.asList(8D, 12D, 20D);
    assertThat(result, is(expected));
  }

}