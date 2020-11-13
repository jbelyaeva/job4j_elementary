package ru.job4j.condition;

public class Max {

  public static int max(int one, int two) {
    int result = (one >= two) ? one : two;
    return result;
  }

  public static int max(int one, int two, int three) {
    return max(three, max(one, two));
  }

  public static int max(int one, int two, int three, int four) {
    return max(four, max(one, two, three));
  }

  public static void main(String[] args) {
    System.out.println(max(1, 2));
    System.out.println(max(7, 1, 10));
    System.out.println(max(0, -9, 5, 20));
  }
}
