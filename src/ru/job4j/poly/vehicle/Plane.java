package ru.job4j.poly.vehicle;

public class Plane implements Vehicle {

  @Override
  public void move() {
    System.out.println(getClass().getSimpleName() + " летает по воздуху.");
  }
}
