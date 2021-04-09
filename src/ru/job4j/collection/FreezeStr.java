package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class FreezeStr {

  public static boolean eq(String left, String right) {
    char[] leftArray = left.toCharArray();
    char[] rightArray = right.toCharArray();
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    for (char l : leftArray) {
      int value = 1;
      if (map.containsKey(l)) {
        value = map.get(l);
        value++;
      }
      map.put(l, value);
    }
    for (char r : rightArray) {
      if (!map.containsKey(r)) {
        return false;
      }
      if (map.containsKey(r)) {
        int value = map.get(r);
        if (value == 1) {
          map.remove(r);
        } else {
          map.put(r, value - 1);
        }
      }
    }
    return map.isEmpty();
  }
}
