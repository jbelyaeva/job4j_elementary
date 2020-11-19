package ru.job4j.pojo;

public class Library {

  public static void main(String[] args) {
    Book first = new Book("Волшебник Изумрудного города", 200);
    Book second = new Book("Сто лет одиночества", 600);
    Book third = new Book("Гаврош", 30);
    Book fourth = new Book("Clean code", 500);

    Book[] books = new Book[4];
    books[0] = first;
    books[1] = second;
    books[2] = third;
    books[3] = fourth;
    for (int index = 0; index < books.length; index++) {
     Book book = books[index];
      System.out.println(book.getName() + " - " + book.getPageCount());
    }
    System.out.println("");
    books[0] = third;
    books[2] = first;
    for (int index = 0; index < books.length; index++) {
      Book book = books[index];
      System.out.println(book.getName() + " - " + book.getPageCount());
    }
    System.out.println("");
    System.out.println("Print books with name Clean code");
    for (int index = 0; index < books.length; index++) {
     Book book = books[index];
      if (book.getName().equals("Clean code")) {
        System.out.println(book.getName() + " - " + book.getPageCount());
      }
    }
  }
}
