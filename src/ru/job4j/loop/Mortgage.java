package ru.job4j.loop;

public class Mortgage {

  public static int year(int amount, int salary, double percent) {
    int year = 1;
    amount = (int) (amount * 0.01 * percent + amount);

    while (amount > salary) {
      amount -= salary;
      amount = (int) (amount * 0.01 * percent + amount);
      year++;
    }
    return year;
  }
}
