package ru.job4j.loop;

public class Mortgage {

  public static int year(int amount, int salary, double percent) {
    int year = 1;
    double dolg = amount * 0.01 * percent + amount;

    while (dolg > salary) {
      double dolgInEndYear = dolg * 0.01 * percent + amount;
      dolg = dolgInEndYear - salary;
      year++;
    }
    return year;
  }
}
