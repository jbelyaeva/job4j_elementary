package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Matrix {

  public static List<Integer> transform(Integer[][] startMatrix) {
    return Arrays.stream(startMatrix)
        .map(integers -> Arrays.stream(integers)
            .collect(Collectors.toList()))
        .flatMap(e -> e.stream())
        .collect(Collectors.toList());
  }
}
