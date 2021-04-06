package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class Article {

  public static boolean generateBy(String origin, String line) {
    String[] originText = origin.split(" |[.,:!]");
    String[] newText = line.split(" ");
    Map<String, Integer> map1 = new HashMap<String, Integer>();
    Map<String, Integer> map2 = new HashMap<String, Integer>();
    for (String o : originText) {
      int value = 1;
      if (map1.containsKey(o)) {
        value = map1.get(o);
        value++;
      }
      map1.put(o, value);
    }

    for (String n : newText) {
      int value = 1;
      if (map2.containsKey(n)) {
        value = map2.get(n);
        value++;
      }
      map2.put(n, value);
    }

    for (String s : map2.keySet()) {
      if (!map1.containsKey(s)) {
        return false;
      }
    }
    return true;
  }
}
