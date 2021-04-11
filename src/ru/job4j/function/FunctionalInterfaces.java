package ru.job4j.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterfaces {

  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    String[] word = {"one", "two", "three", "four", "five", "six", "seven"};
    BiConsumer<Integer, String> biCon = (s, s1) -> map.put(s, s1);
    for (int i = 1; i < 8; i++) {
      biCon.accept(i, word[i - 1]);
    }

    BiPredicate<Integer, String> biPred = (i, s) -> {
      if ((i % 2 == 0) || (s.length() == 4)) {
        return true;
      }
      return false;
    };

    for (Integer i : map.keySet()) {
      if (biPred.test(i, map.get(i))) {
        System.out.println("key: " + i + " value: " + map.get(i));
      }
    }

    Supplier<List<String>> sup = () -> new ArrayList<>(map.values());
    List<String> strings = sup.get();
    Consumer<String> con = (s) -> System.out.println(s);
    con.accept(String.valueOf(strings));
    Function<String, String> func = s -> s.toUpperCase();
    for (String s : strings) {
      con.accept(func.apply(s));
    }
  }
}
