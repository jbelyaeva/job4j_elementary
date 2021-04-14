package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import ru.job4j.collection.JobAscByPriority;
import ru.job4j.collection.JobDescByName;

public class FI {

  public static void main(String[] args) {

    Attachment[] atts = {
        new Attachment("image 1", 20),
        new Attachment("image 3", 120),
        new Attachment("image 2", 23),
        new Attachment("im 22", 23)
    };

    System.out.println("сортировка по размеру");
    Comparator<Attachment> comparator = (left, right) -> left.getSize() - right.getSize();
    Arrays.sort(atts, comparator);
    for (Attachment a : atts) {
      System.out.println(a);
    }

    List<String> mas = new ArrayList<>();
    for (Attachment a : atts) {
      mas.add(a.getName());
    }

    System.out.println("сортировка по длине строки");
    Comparator<String> cmpSize = (left, right) -> left.length() - right.length();
    Collections.sort(mas, cmpSize);
    for (String m : mas) {
      System.out.println(m);
    }

    System.out.println("сортировка по возрастанию");
    Comparator<String> cmpText = (left, right) -> left.compareTo(right);
    Collections.sort(mas, cmpText);
    for (String m : mas) {
      System.out.println(m);
    }

    System.out.println("сортировка по убыванию длины");
    Comparator<String> cmpDescSize = (left, right) -> right.length() - left.length();

    Collections.sort(mas, cmpDescSize);
    for (String m : mas) {
      System.out.println(m);
    }
  }
}
