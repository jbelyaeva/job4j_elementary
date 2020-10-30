package ru.job4j.array;

import java.util.Arrays;

public class Machine {

  private final int[] COINS = {10, 5, 2, 1};

  public int[] change(int money, int price) {
    int[] rsl = new int[100];
    int sdaha = money - price;
    int size = 0;
    for (int j = 0; j < COINS.length; j++) {
      while (sdaha >= COINS[j]) {
        sdaha = sdaha - COINS[j];
        rsl[size] = COINS[j];
        size++;
      }
    }
    return Arrays.copyOf(rsl, size);
  }
}
