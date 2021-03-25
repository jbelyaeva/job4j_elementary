package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

  @Override
  public int compare(String o1, String o2) {
    int rsl;
    char[] leftArray = o1.toCharArray();
    char[] rightArray = o2.toCharArray();
    int countSteps = Math.min(leftArray.length, rightArray.length);
    for (int i = 0; i < countSteps; i++) {
      rsl = Character.compare(rightArray[i], leftArray[i]);
      if ((rsl != 0) && (i < 2)) {
        return rsl;
      } else if (rsl != 0) {
        rsl = Character.compare(leftArray[i], rightArray[i]);
        return rsl;
      }
    }
    return Integer.compare(leftArray.length, rightArray.length);
  }
}
