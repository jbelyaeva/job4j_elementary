package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class Article {

  public static boolean generateBy(String origin, String line) {
    boolean rsl = true;
    String[] originText = origin.split(" |[.,:!]");
    String[] newText = line.split(" ");
    Map<String, String> check = new HashMap<>();
    for (String o : originText) {
      check.put(o, "");
    }
    for (String t : newText) {
      if (!check.containsKey(t)) {
        rsl = false;
        break;
      }
    }
    return rsl;
  }
}
