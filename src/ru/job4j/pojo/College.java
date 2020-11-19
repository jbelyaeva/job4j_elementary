package ru.job4j.pojo;

import java.util.Date;

public class College {

  public static void main(String[] args) {
    Student student = new Student();
    student.setName("Ваня");
    student.setSurname("Ванин");
    student.setPatronymic("Иванович");
    student.setGroup(12);
    student.setReceipt(new Date());

    System.out.println(
        student.getName() +
            " " + student.getSurname() +
            " " + student.getPatronymic() +
            " зачислен в группу №" + student.getGroup() + " " +
            student.getReceipt());
  }
}
