package ru.job4j.pojo;

import java.util.Date;

public class Student {
  private String name;
  private String surname;
  private String patronymic;
  private int group;
  private Date receipt;

  public Student() {
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public void setPatronymic(String patronymic) {
    this.patronymic = patronymic;
  }

  public void setGroup(int group) {
    this.group = group;
  }

  public void setReceipt(Date receipt) {
    this.receipt = receipt;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public String getPatronymic() {
    return patronymic;
  }

  public int getGroup() {
    return group;
  }

  public Date getReceipt() {
    return receipt;
  }
}
