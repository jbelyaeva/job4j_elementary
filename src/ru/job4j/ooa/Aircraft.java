package ru.job4j.ooa;

public class Aircraft {
  //нельзя использовать final в методе, т.к. по смыслу этот метод должен переопределяться
  public void printModel() {
    System.out.println("Метод выводит в консоль модель самолета.");
  }
}
