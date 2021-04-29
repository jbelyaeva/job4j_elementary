package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Matrix {

  public static List<Integer> transform(Integer[][] startMatrix) {
    List<List<Integer>> matrix;
    matrix = Arrays.stream(startMatrix)
        .map(integers -> Arrays.stream(integers).collect(Collectors.toList()))
        .collect(Collectors.toList());

    return matrix.stream()
        .flatMap(e -> e.stream())
        .collect(Collectors.toList());
  }
}
