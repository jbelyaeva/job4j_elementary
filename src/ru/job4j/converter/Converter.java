package ru.job4j.converter;

public class Converter {

  public static int rubleToEuro(int value) {
    return value / 70;
  }

  public static int rubleToDollar(int value) {
    return value / 60;
  }

  public static Boolean testRubblesToEuros(int rubles, int expected) {
    int out = Converter.rubleToEuro(rubles);
    return expected == out;
  }

  public static Boolean testRubblesToDollars(int rubles, int expected) {
    int out = Converter.rubleToDollar(rubles);
    return expected == out;
  }

  public static void main(String[] args) {
    int rubles = 5000;
    System.out.println(
        rubles + " rubles are " + Converter.rubleToEuro(rubles) + " euro. Test result : "
            + testRubblesToEuros(rubles, 71));
    System.out.println(
        rubles + " rubles are " + Converter.rubleToDollar(rubles) + " doll. Test resule : "
            + testRubblesToDollars(rubles, 83));
  }
}
