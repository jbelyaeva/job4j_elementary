package ru.job4j.collection;

import java.util.HashSet;

public class Article {

  public static boolean generateBy(String origin, String line) {
    boolean rsl = true;
    String[] originWords = origin.replaceAll("\\p{P}", "").split(" ");
    String[] text = line.replaceAll("\\p{P}", "").split(" ");
    HashSet<String> check = new HashSet<>();
    for (String o : originWords) {
      check.add(o);
    }
    for (String t : text) {
      if (!check.contains(t)) {
        rsl = false;
        break;
      }
    }
    return rsl;
  }
}
