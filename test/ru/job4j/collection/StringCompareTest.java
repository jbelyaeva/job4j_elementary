package ru.job4j.collection;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

import org.junit.Test;

public class StringCompareTest {

  @Test
  public void whenStringsAreEqualThenZero () {
    StringCompare compare = new StringCompare();
    int rst = compare.compare(
        "Ivanov",
        "Ivanov"
    );
    assertThat(rst, is(0));
  }

  @Test
  public void whenLeftLessThanRightResultShouldBeNegative () {
    StringCompare compare = new StringCompare();
    int rst = compare.compare(
        "Ivanov",
        "Ivanova"
    );
    assertThat(rst, lessThan(0));
  }

  @Test
  public void whenLeftGreaterThanRightResultShouldBePositive () {
    StringCompare compare = new StringCompare();
    int rst = compare.compare(
        "Petrov",
        "Ivanova"
    );
    assertThat(rst, greaterThan(0));
  }

  @Test
  public void secondCharOfLeftGreaterThanRightShouldBePositive(){
    StringCompare compare = new StringCompare();
    int rst = compare.compare(
        "Petrov",
        "Patrov"
    );
    assertThat(rst, greaterThan(0));
  }

  @Test
  public void secondCharOfLeftLessThanRightShouldBeNegative(){
    StringCompare compare = new StringCompare();
    int rst = compare.compare(
        "Patrova",
        "Petrov"
    );
    assertThat(rst, lessThan(0));
  }

  @Test
  public void whenDifferentAlfSecondCharOfLeftGreaterThanRightShouldBePositive(){
    StringCompare compare = new StringCompare();
    int rst = compare.compare(
        "Беляева",
        "Petrov"
    );
    assertThat(rst, greaterThan(0));
  }

  @Test
  public void whenSecondCharWithNumberOfLeftLessThanRightShouldBeNegative(){
    StringCompare compare = new StringCompare();
    int rst = compare.compare(
        "123",
        "Petrov"
    );
    assertThat(rst, lessThan(0));
  }
}