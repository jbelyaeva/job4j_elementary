package ru.job4j.poly.vehicle;

public class Bus implements Vehicle {

  @Override
  public void move() {
    System.out.println(getClass().getSimpleName() + " ездит по скоростным трассам.");
  }
}
