package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

  @Override
  public int compare(String left, String right) {
    String[] leftSplit = left.split("\\.");
    String[] rightSplit = right.split("\\.");
    int valueLeft = Integer.parseInt(leftSplit[0].replaceAll("[^0-9]", ""));
    int valueRight = Integer.parseInt(rightSplit[0].replaceAll("[^0-9]", ""));
    return Integer.compare(valueLeft, valueRight);
  }
}