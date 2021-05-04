package ru.job4j.stream.builder;

import java.util.Arrays;

public class Pupil {

  private String name;
  private String surname;
  private int age;
  private int idFamily;
  private String tz;
  private String country;
  private int[] skills;
  private String email;

  static class Builder {

    private String name;
    private String surname;
    private int age;
    private int idFamily;
    private String tz;
    private String country;
    private int[] skills;
    private String email;

    Builder withName(String name) {
      this.name = name;
      return this;
    }

    Builder withSurname(String surname) {
      this.surname = surname;
      return this;
    }

    Builder withAge(int age) {
      this.age = age;
      return this;
    }

    Builder withIdFamily(int idFamily) {
      this.idFamily = idFamily;
      return this;
    }

    Builder withTz(String tz) {
      this.tz = tz;
      return this;
    }

    Builder withCountry(String country) {
      this.country = country;
      return this;
    }

    Builder withSkills(int[] skills) {
      this.skills = skills;
      return this;
    }

    Builder withEmail(String email) {
      this.email = email;
      return this;
    }

    Pupil build() {
      Pupil student = new Pupil();
      student.name = name;
      student.surname = surname;
      student.age = age;
      student.idFamily = idFamily;
      student.tz = tz;
      student.country = country;
      student.skills = skills;
      student.email = email;
      return student;
    }
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", age=" + age +
        ", idFamily=" + idFamily +
        ", tz='" + tz + '\'' +
        ", country='" + country + '\'' +
        ", skills=" + Arrays.toString(skills) +
        ", email='" + email + '\'' +
        '}';
  }
}
