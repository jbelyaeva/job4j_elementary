package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class SearchFolder {

  public static List<Folder> filter(List<Folder> list, Predicate<Folder> pred) {
    List<Folder> result = new ArrayList<>();
    Function<Folder, List<Folder>> func = (f) -> {
      result.add(f);
      return result;
    };

    for (Folder f : list) {
      if (pred.test(f)) {
        func.apply(f);
      }
    }
    return result;
  }
}
