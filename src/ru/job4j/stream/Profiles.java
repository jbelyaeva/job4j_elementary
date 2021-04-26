package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

  public List<Address> collect(List<Profile> profiles) {

    List<Address> addresses = profiles.stream()
        .map(Profile::getAddress)
        .collect(Collectors.toList());

    return addresses.stream()
        .sorted((o1, o2) -> o1.getCity().compareTo(o2.getCity()))
        .distinct()
        .collect(Collectors.toList());
  }

}

