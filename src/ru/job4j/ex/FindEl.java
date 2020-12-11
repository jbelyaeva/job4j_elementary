package ru.job4j.ex;

public class FindEl {

  public static int indexOf(String[] value, String key) throws ElementNotFoundException {
    int rsl = -1;
    int index = 0;
    for (String element : value) {
      if (element.equals(key)) {
        rsl = index;
        break;
      }
      index++;
    }
    if (rsl == -1) {
      throw new ElementNotFoundException("Element not found");
    }
    return rsl;
  }

  public static void main(String[] args) {
    try {
      System.out.println(indexOf(new String[]{"Petr", "Ivan", "Nik", "Vasya"}, "123"));
    } catch (ElementNotFoundException e) {
      e.printStackTrace();
    }
  }
}
