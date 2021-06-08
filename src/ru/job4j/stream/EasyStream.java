package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class EasyStream {

  private static List<Integer> str = new ArrayList<>();

  private Consumer<Consumer<Integer>> action;

  public EasyStream(Consumer<Consumer<Integer>> action) {
    this.action = action;
  }

  public void forEach(Consumer<Integer> cons) {
    action.accept(cons);
  }

  public Integer[] toArray(IntFunction<Integer[]> fun) {
    final List<Integer> res = new ArrayList<>();
    forEach(e -> res.add(e));
    return res.toArray(fun.apply(res.size()));
  }

  public static EasyStream of(List<Integer> sourse) {
    Iterable<Integer> result = new Iterable<Integer>() {
      @Override
      public Iterator<Integer> iterator() {
        return sourse.stream().iterator();
      }
    };
    EasyStream res = new EasyStream(result::forEach);
    str = Arrays.asList(res.toArray(Integer[]::new));
    return res;
  }

  public EasyStream map(Function<Integer, Integer> fun) {
    EasyStream rsl = new EasyStream(cons -> forEach(e -> cons.accept(fun.apply(e))));
    str = Arrays.asList(rsl.toArray(Integer[]::new));
    return rsl;
  }

  public EasyStream filter(Predicate<Integer> fun) {
    EasyStream rsl = new EasyStream(cons -> forEach(e -> {
      if (fun.test(e)) {
        cons.accept(e);
      }
    }));
    str = Arrays.asList(rsl.toArray(Integer[]::new));
    return rsl;
  }

  public List<Integer> collect() {
    return str;
  }

}
