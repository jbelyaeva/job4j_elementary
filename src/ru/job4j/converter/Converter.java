package ru.job4j.converter;

public class Converter {

  public static int rubleToEuro(int value) {
    return value / 70;
  }

  public static int rubleToDollar(int value) {
    return value / 60;
  }

  public static void main(String[] args) {
    int rubles = 5000;
    System.out.println(rubles+" rubles are " + Converter.rubleToEuro(rubles) + " euro.");
    System.out.println(rubles+" rubles are " + Converter.rubleToDollar(rubles) + " doll.");
  }

}
