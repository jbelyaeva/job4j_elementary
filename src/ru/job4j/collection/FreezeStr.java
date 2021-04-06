package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class FreezeStr {

  public static boolean eq(String left, String right) {
    char[] leftArray = left.toCharArray();
    char[] rightArray = right.toCharArray();
    Map<Character, Integer> map1 = new HashMap<Character, Integer>();
    Map<Character, Integer> map2 = new HashMap<Character, Integer>();
    for (char l : leftArray) {
      int value = 1;
      if (map1.containsKey(l)) {
        value = map1.get(l);
        value++;
      }
      map1.put(l, value);
    }

    for (char r : rightArray) {
      int value = 1;
      if (map2.containsKey(r)) {
        value = map2.get(r);
        value++;
      }
      map2.put(r, value);
    }

    if (map1.size() != map2.size()) {
      return false;
    }
    for (char c : map1.keySet()) {
      if (!map2.containsKey(c) || map1.get(c) != map2.get(c)) {
        return false;
      }
    }
    return true;
  }
}
