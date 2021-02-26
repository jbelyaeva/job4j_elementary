package ru.job4j.collection;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class PassportOfficeTest {
  @Test
  public void add() {
    Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
    PassportOffice office = new PassportOffice();
    office.add(citizen);
    assertThat(office.get(citizen.getPassport()), is(citizen));
  }
}