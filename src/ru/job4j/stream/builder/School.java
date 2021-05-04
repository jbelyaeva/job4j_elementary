package ru.job4j.stream.builder;

import ru.job4j.stream.builder.Pupil.Builder;

public class School {

  public static void main(String[] args) {

    Pupil student = new Builder().withName("Вася")
        .withSurname("Васин")
        .withAge(12)
        .withIdFamily(1)
        .withTz("Europe/Moscow")
        .withCountry("Russia")
        .withSkills(new int[]{1, 2, 3})
        .withEmail("mail@MAIL.RU")
        .build();
    System.out.println(student);
  }
}
