package ru.job4j.poly.vehicle;

public class Movement {

  public static void main(String[] args) {
    Vehicle bus = new Bus();
    Vehicle plane = new Plane();
    Vehicle train = new Train();
    Vehicle[] vehicle = new Vehicle[]{bus, train, plane};
    for (Vehicle a : vehicle) {
      a.move();
    }
  }
}
