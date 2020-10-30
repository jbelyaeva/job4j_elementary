package ru.job4j.array;

public class Defragment {

  private static void scrambling(String[] array, int index) {
    String temp = array[index];
    for (int i = index; i < array.length - 1; i++) {
      array[i] = array[i + 1];
    }
    array[array.length - 1] = temp;
  }

  public static String[] compress(String[] array) {
    int counter = 0;
    for (int index = 0; index < array.length; index++) {
      if ((array[index] == null) && (index != array.length - 1)) {
        scrambling(array, index);
        index--;
        counter++;
        if (counter == array.length - 1) {
          break;
        }
      }
    }
    return array;
  }

  public static void main(String[] args) {
    String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
    String[] compressed = compress(input);
    System.out.println();
    for (int index = 0; index < compressed.length; index++) {
      System.out.print(compressed[index] + " ");
    }
  }

}
