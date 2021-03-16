package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

  @Override
  public int compare(String left, String right) {
    int rsl = -1;
    char[] leftArray = left.toCharArray();
    char[] rightArray = right.toCharArray();
    int countSteps = Math.min(leftArray.length, rightArray.length);
    for (int i = 0; i < countSteps; i++) {
      rsl = Character.compare(leftArray[i], rightArray[i]);
      if (rsl != 0) {
        return rsl;
      }
    }
      return (rsl == 0 && leftArray.length != rightArray.length) ? -1 : 0;
  }
}
