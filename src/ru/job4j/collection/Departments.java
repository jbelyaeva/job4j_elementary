package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Departments {

  public static List<String> fillGaps(List<String> deps) {
    Set<String> tmp = new LinkedHashSet<>();
    for (int i = 0; i < deps.size(); i++) {
      String str = deps.get(i);
      String[] elements = str.split("/");
      String rsl = "";
      for (String el : elements) {
        if (rsl.equals("")) {
          rsl = el;
        } else {
          rsl = rsl + "/" + el;
        }
        tmp.add(rsl);
      }
    }
    return new ArrayList<>(tmp);
  }

  public static List<String> sortAsc(List<String> orgs) {
    orgs.sort(Comparator.naturalOrder());
    return new ArrayList<>(orgs);
  }

  public static List<String> sortDesc(List<String> orgs) {
    orgs.sort(new DepDescComp());
    return new ArrayList<>(orgs);
  }
}
