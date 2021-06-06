package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.difference;
import static ru.job4j.math.MathFunction.division;
import static ru.job4j.math.MathFunction.multiply;
import static ru.job4j.math.MathFunction.sum;

public class MathCalculator {

  public static double sumAndMultiply(double first, double second) {
    return sum(first, second)
        + multiply(first, second);
  }

  public static double sumAll(double first, double second) {
    return difference(first, second)
        + division(first, second)
        + sum(first, second)
        + multiply(first, second);
  }

  public static double sumDifferenceAndDivision(double first, double second) {
    return difference(first, second)
        + division(first, second);
  }

  public static void main(String[] args) {
    System.out.println("Результат расчета sumAndMultiply равен: " + sumAndMultiply(10, 20));
    System.out.println(
        "Результат расчета sumDifferenceAndDivision равен: " + sumDifferenceAndDivision(10, 20));
    System.out.println("Результат расчета sumAll равен: " + sumAll(10, 20));
  }
}
