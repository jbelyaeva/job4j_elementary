package ru.job4j.oop;

public class Cat {

  private String food;
  private String name;

  public void show() {
    System.out.print(this.name + " кушал: ");
    System.out.println(this.food);
  }

  public void eat(String meat) {
    this.food = meat;
  }

  public void giveNick(String nick) {
    this.name = nick;
  }

  public static void main(String[] args) {
    Cat gav = new Cat();
    gav.eat("kotleta");
    gav.giveNick("Гав");
    gav.show();
    Cat black = new Cat();
    black.eat("fish");
    black.giveNick("Черный кот");
    black.show();
  }


}
