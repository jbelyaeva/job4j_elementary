package ru.job4j.oop.inheritance;

import java.util.Date;

public class Profession {

  private String name;
  private String surname;
  private String education;
  private Date birthday;

  public Profession(){}

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public String getEducation() {
    return education;
  }

  public Date getBirthday() {
    return birthday;
  }
}
