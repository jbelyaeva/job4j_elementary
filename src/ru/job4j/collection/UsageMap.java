package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("mail@mail.ru", "Беляева Юлия Николаевна");
    map.put("pol@mail.ru", "Иванов Иван Иванович");
    map.put("gnom@mail.ru", "Петров Петр Петрович");

    for (String key : map.keySet()) {
      String value = map.get(key);
      System.out.println(key + " = " + value);
    }
  }
}
