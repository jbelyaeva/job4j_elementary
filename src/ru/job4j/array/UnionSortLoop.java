package ru.job4j.array;

public class UnionSortLoop {

  public static int[] union(int[] left, int[] right) {
    int[] rsl = new int[left.length + right.length];

    int indexRsl = 0;
    int indexRight = 0;
    int indexLeft = 0;
    for (int i = 0; i < left.length; i++) {
      for (int j = indexRight; j < right.length; j++) {
        if (left[i] < right[j]) {
          rsl[indexRsl] = left[i];
          indexRsl++;
          indexLeft++;
          break;
        }
        if (left[i] == right[j]) {
          rsl[indexRsl] = right[j];
          rsl[indexRsl + 1] = left[i];
          indexRsl = indexRsl + 2;
          indexRight++;
          indexLeft++;
          break;
        }
        if (left[i] > right[j]) {
          rsl[indexRsl] = right[j];
          indexRsl++;
          i--;
          indexRight++;
          break;
        }
      }
    }
    if (indexLeft < indexRight) {
      for (int i = indexLeft; i < left.length; i++) {
        rsl[indexRsl] = left[i];
        indexRsl++;
      }
    } else {
      for (int i = indexRight; i < right.length; i++) {
        rsl[indexRsl] = right[i];
        indexRsl++;
      }
    }
    return rsl;
  }
}
