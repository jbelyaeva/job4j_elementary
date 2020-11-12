package ru.job4j.oop;

public class Battery {

  private int value;

  public Battery(int size) {
    this.value = size;
  }

  public void exchange(Battery another) {
    another.value = this.value + another.value;
    this.value = 0;
  }

  public static void main(String[] args) {
    Battery first = new Battery(20);
    Battery second = new Battery(30);
    System.out.println("first : " + first.value + ". second : " + second.value);
    first.exchange(second);
    System.out.println("first : " + first.value + ". second : " + second.value);

  }

}
