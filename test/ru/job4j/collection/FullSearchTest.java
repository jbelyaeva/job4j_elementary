package ru.job4j.collection;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Test;

public class FullSearchTest {
  @Test
  public void extractNumber() {
    List<Task> tasks = Arrays.asList(
        new Task("1", "First desc"),
        new Task("2", "Second desc"),
        new Task("1", "First desc")
    );
    Set<String> expected = new HashSet<>(Arrays.asList("1", "2"));
    assertThat(FullSearch.extractNumber(tasks), is(expected));
  }
}