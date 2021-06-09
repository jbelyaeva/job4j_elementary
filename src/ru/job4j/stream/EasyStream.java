package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EasyStream {

  private List<Integer> str;

  private EasyStream(List<Integer> source) {
    this.str = source;
  }

  public static EasyStream of(List<Integer> source) {
    return new EasyStream(source);
  }

  public EasyStream map(Function<Integer, Integer> fun) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < str.size(); i++) {
      list.add(fun.apply(str.get(i)));
    }
    return new EasyStream(list);
  }

  public EasyStream filter(Predicate<Integer> fun) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < str.size(); i++) {
      if (fun.test(str.get(i))) {
        list.add(str.get(i));
      }
    }
    return new EasyStream(list);
  }

  public List<Integer> collect() {
    return str;
  }
}
