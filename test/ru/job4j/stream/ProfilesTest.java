package ru.job4j.stream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class ProfilesTest {

  @Test
  public void whenProfile() {
    List<Profile> profileList = new ArrayList<>();
    profileList.add(new Profile(new Address("Москва", "Гагарина", 6, 7)));
    profileList.add(new Profile(new Address("Волгоград", "Ленина", 3, 45)));
    profileList.add(new Profile(new Address("Санкт-Питергбург", "Невский проспект", 3, 10)));
    Profiles profiles = new Profiles();
    List<Address> rsl = profiles.collect(profileList);
    List<Address> expected = new ArrayList<>();
    expected.add(new Address("Москва", "Гагарина", 6, 7));
    expected.add(new Address("Волгоград", "Ленина", 3, 45));
    expected.add(new Address("Санкт-Питергбург", "Невский проспект", 3, 10));
    assertThat(rsl, is(expected));
  }
}