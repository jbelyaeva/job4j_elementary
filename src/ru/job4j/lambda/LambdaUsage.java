package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

public class LambdaUsage {

  public static void main(String[] args) {

    Attachment[] atts = {
        new Attachment("image 1", 20),
        new Attachment("i 3", 120),
        new Attachment("imag 2", 23),
        new Attachment("im 22", 23)
    };

    List<String> mas = new ArrayList<>();
    for (Attachment a : atts) {
      mas.add(a.getName());
    }

    System.out.println("сортировка по убыванию длины");
    Comparator<String> cmpDescSize = (left, right) -> {
      System.out.println("compare - " + left + " : " + right);
      return Integer.compare(right.length(), left.length());
    };
    
    Collections.sort(mas, cmpDescSize);
    for (String m : mas) {
      System.out.println(m);
    }
  }
}
