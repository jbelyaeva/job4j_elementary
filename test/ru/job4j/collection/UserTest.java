package ru.job4j.collection;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.junit.Test;

public class UserTest {
  @Test
  public void whenAsc() {
    Set<User> users = new TreeSet<>();
    users.add(new User("Petr", 32));
    users.add(new User("Ivan", 31));
    users.add(new User("Ivan", 29));
    Iterator<User> it = users.iterator();
    assertThat(it.next(), is(new User("Ivan", 29)));
    assertThat(it.next(), is(new User("Ivan", 31)));
    assertThat(it.next(), is(new User("Petr", 32)));
  }

  @Test
  public void whenComparePertVSIvan() {
    int rsl = new User("Petr", 32)
        .compareTo(
            new User("Ivan", 31)
        );
    assertThat(rsl, greaterThan(0));
  }

  @Test
  public void whenComparePertVSPetr() {
    int rsl = new User("Petr", 32)
        .compareTo(
            new User("Petr", 31)
        );
    assertThat(rsl, greaterThan(0));
  }

  @Test
  public void whenCompare() {
    List<User> users = new ArrayList<>();
    users.add(new User("Petr", 32));
    users.add(new User("Ivan", 31));
    users.add(new User("Ivan", 35));
    users.add(new User("Anna", 35));
    Collections.sort(users);
    List<User> newUsers = new ArrayList<>();
    newUsers.add(new User("Anna", 35));
    newUsers.add(new User("Ivan", 31));
    newUsers.add(new User("Ivan", 35));
    newUsers.add(new User("Petr", 32));
    assertThat(users, equalTo(newUsers));
  }
}