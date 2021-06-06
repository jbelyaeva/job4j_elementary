package ru.job4j.stream;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EasyStream {

  private Stream<Integer> str;

  private EasyStream(Stream<Integer> str) {
    this.str = str;
  }

  public static EasyStream of(List<Integer> source) {
    return new EasyStream(source.stream());
  }

  public EasyStream map(Function<Integer, Integer> fun) {
    return new EasyStream(str.map(fun));
  }

  public EasyStream filter(Predicate<Integer> fun) {
    return new EasyStream(str.filter(fun));
  }

  public List<Integer> collect() {
    return this.str.collect(Collectors.toList());
  }
}
