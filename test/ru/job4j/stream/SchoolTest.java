package ru.job4j.stream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import org.junit.Test;

public class SchoolTest {

  @Test
  public void whenCollectClassA() {
    List<Student> students = List.of(
        new Student(10, "Surname1"),
        new Student(40, "Surname4"),
        new Student(50, "Surname5"),
        new Student(70, "Surname7"),
        new Student(90, "Surname9")
    );
    School sc = new School();
    Predicate<Student> pr = t -> (t.getScore() >= 70) && (t.getScore() <= 100);
    List<Student> rsl = sc.collect(students, pr);
    List<Student> expected = new ArrayList<>();
    expected.add(new Student(70, "Surname7"));
    expected.add(new Student(90, "Surname9"));
    assertThat(rsl, is(expected));
  }

  @Test
  public void whenCollectClassB() {
    List<Student> students = List.of(
        new Student(20, "Surname2"),
        new Student(30, "Surname3"),
        new Student(50, "Surname5"),
        new Student(60, "Surname6"),
        new Student(80, "Surname8")
    );
    School sc = new School();
    Predicate<Student> pr = t -> (t.getScore() >= 50) && (t.getScore() < 70);
    List<Student> rsl = sc.collect(students, pr);
    List<Student> expected = new ArrayList<>();
    expected.add(new Student(50, "Surname5"));
    expected.add(new Student(60, "Surname6"));
    assertThat(rsl, is(expected));
  }

  @Test
  public void whenCollectClassV() {
    List<Student> students = List.of(
        new Student(10, "Surname1"),
        new Student(30, "Surname3"),
        new Student(40, "Surname4"),
        new Student(60, "Surname6"),
        new Student(90, "Surname9")
    );
    School sc = new School();
    Predicate<Student> pr = t -> t.getScore() < 50;
    List<Student> rsl = sc.collect(students, pr);
    List<Student> expected = new ArrayList<>();
    expected.add(new Student(10, "Surname1"));
    expected.add(new Student(30, "Surname3"));
    expected.add(new Student(40, "Surname4"));
    assertThat(rsl, is(expected));
  }

  @Test
  public void whenListToMap() {
    School sc = new School();
    List<Student> students = List.of(
        new Student(10, "Surname1"),
        new Student(30, "Surname3"),
        new Student(40, "Surname4"),
        new Student(40, "Surname4"),
        new Student(90, "Surname9")
    );
    Map<String, Student> rsl = sc.mapcollect(students);
    Map<String, Student> expected = new HashMap<>();
    expected.put("Surname1", new Student(10, "Surname1"));
    expected.put("Surname3", new Student(30, "Surname3"));
    expected.put("Surname4", new Student(40, "Surname4"));
    expected.put("Surname9", new Student(90, "Surname9"));
    assertThat(rsl, is(expected));
  }
}