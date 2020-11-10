package ru.job4j.array;

public class UnionSortLoop {

  public static int[] union(int[] left, int[] right) {
    int[] rsl = new int[left.length + right.length];
    int leftIndex = 0;
    int rightIndex = 0;
    while (leftIndex + rightIndex < rsl.length) {
      if (rightIndex == right.length
          || leftIndex != left.length && left[leftIndex] < right[rightIndex]) {
        rsl[leftIndex + rightIndex] = left[leftIndex++];
      } else {
        rsl[leftIndex + rightIndex] = right[rightIndex++];
      }
    }
    return rsl;
  }
}
