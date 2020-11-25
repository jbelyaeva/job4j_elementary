package ru.job4j.io;

import java.util.Scanner;

public class Matches {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int ost = 11;
    System.out.println("По очереди берите спички от 1 до 3-х");
    while (ost > 0) {
      int i = 1;
      while (i < 4) {
        System.out.println("Игрок " + i + ", ваш ход.");
        int count = Integer.valueOf(input.nextLine());

        while (count == 0 || count > 3) {
          System.out
              .println("Игрок " + i + ", вы взяли неверное число спичек. Берите от 1 до 3-х.");
          count = Integer.valueOf(input.nextLine());
        }

        ost -= count;
        if (ost > 0) {
          System.out.println("Осталось " + ost + " спичек.");
          i += 1;
        } else {
          System.out.println("Игрок " + i + " выиграл.");
          break;
        }
      }
    }
  }
}
