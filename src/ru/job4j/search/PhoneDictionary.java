package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {

  private ArrayList<Person> persons = new ArrayList<>();

  public void add(Person person) {
    this.persons.add(person);
  }

  /**
   * Вернуть список всех пользователей, который содержат key в любых полях.
   *
   * @param key Ключ поиска.
   * @return Список подощедщих пользователей.
   */
  public ArrayList<Person> find(String key) {
    ArrayList<Person> result = new ArrayList<>();
    Predicate<Person> name = t -> t.getName().contains(key);
    Predicate<Person> surname = t -> t.getSurname().contains(key);
    Predicate<Person> address = t -> t.getAddress().contains(key);
    Predicate<Person> phone = t -> t.getPhone().contains(key);
    Predicate<Person> combine = (name).or(surname).or(address).or(phone);
    
    for (Person person : persons) {
      if (combine.test(person)) {
        result.add(person);
      }
    }
    return result;
  }
}
