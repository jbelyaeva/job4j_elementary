package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Я великий Оракул. Что ты хочешь узнать?");
    input.nextLine();
    int temp = new Random().nextInt(3);
    String answer = temp == 0 ? "Да" : temp == 1 ? "Нет" : "Может быть";
    System.out.println("Ответ: " + answer);
  }
}
