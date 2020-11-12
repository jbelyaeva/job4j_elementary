package ru.job4j.oop.fairytale;

public class Story {

  public static void main(String[] args) {
    Ball ball = new Ball();
    Hare hare = new Hare();
    Wolf wolf = new Wolf();
    Fox fox = new Fox();
    hare.tryEat(ball);
    ball.goAway(hare);
    wolf.tryEat(ball);
    ball.goAway(wolf);
    fox.tryEat(ball);
  }

}
