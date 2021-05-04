package ru.job4j.search;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class PriorityQueueTest {

  @Test
  public void whenHigherPriority() {
    var queue = new PriorityQueue();
    queue.put(new Task("low", 5));
    queue.put(new Task("urgent", 1));
    queue.put(new Task("middle", 3));
    var result = queue.take();
    assertThat(result.getDesc(), is("urgent"));
  }

  @Test
  public void whenHigherPriorityElementInEndQueue() {
    var queue = new PriorityQueue();
    queue.put(new Task("low", 5));
    queue.put(new Task("urgent", 2));
    queue.put(new Task("middle", 3));
    queue.put(new Task("low1", 8));
    queue.put(new Task("urgent1", 1));
    queue.put(new Task("middle1", 6));
    var result = queue.take();
    assertThat(result.getDesc(), is("urgent1"));
  }

  @Test
  public void whenHigherPriorityTwoSimilarElements() {
    var queue = new PriorityQueue();
    queue.put(new Task("low", 5));
    queue.put(new Task("urgent", 2));
    queue.put(new Task("middle", 2));
    queue.put(new Task("low1", 8));
    queue.put(new Task("middle1", 6));
    var result = queue.take();
    assertThat(result.getDesc(), is("urgent"));
  }
}