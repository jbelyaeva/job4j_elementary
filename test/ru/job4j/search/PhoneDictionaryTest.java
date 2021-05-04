package ru.job4j.search;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import org.junit.Test;

public class PhoneDictionaryTest {

  @Test
  public void whenFindByName() {
    var phones = new PhoneDictionary();
    phones.add(
        new Person("Petr", "Arsentev", "534872", "Bryansk")
    );
    var persons = phones.find("Petr");
    assertThat(persons.get(0).getSurname(), is("Arsentev"));
  }

  @Test
  public void whenFindByAddress() {
    var phones = new PhoneDictionary();
    phones.add(
        new Person("Petr", "Arsentev", "534872", "Bryansk")
    );
    var persons = phones.find("Bryansk");
    assertThat(persons.get(0).getSurname(), is("Arsentev"));
  }
}