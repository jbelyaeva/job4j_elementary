package ru.job4j.collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;

import java.util.Comparator;
import org.junit.Assert;
import org.junit.Test;

public class JobTest {

  @Test
  public void whenComparatorDescByName() {
    Comparator<Job> cmpName = new JobDescByName();
    int rsl = cmpName.compare(
        new Job("Impl task", 0),
        new Job("Fix bug", 1)
    );
    Assert.assertThat(rsl, lessThan(0));
  }

  @Test
  public void whenComparatorAscByName() {
    Comparator<Job> cmpName = new JobAscByName();
    int rsl = cmpName.compare(
        new Job("Impl task", 0),
        new Job("Fix bug", 1)
    );
    Assert.assertThat(rsl, greaterThan(0));
  }

  @Test
  public void whenComparatorAscByPriority() {
    Comparator<Job> cmpName = new JobAscByPriority();
    int rsl = cmpName.compare(
        new Job("Impl task", 0),
        new Job("Impl task", 1)
    );
    Assert.assertThat(rsl, lessThan(0));
  }

  @Test
  public void whenComparatorDescByPriority() {
    Comparator<Job> cmpName = new JobDescByPriority();
    int rsl = cmpName.compare(
        new Job("Impl task", 0),
        new Job("Impl task", 1)
    );
    Assert.assertThat(rsl, greaterThan(0));
  }

  @Test
  public void whenComparatorDescByNameAndDescPriority() {
    Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
    int rsl = cmpNamePriority.compare(
        new Job("Impl task", 0),
        new Job("Impl task", 1)
    );
    assertThat(rsl, greaterThan(0));
  }

  @Test
  public void whenComparatorAscByNameAndAscPriority() {
    Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
    int rsl = cmpNamePriority.compare(
        new Job("Impl task", 0),
        new Job("Impl task", 1)
    );
    assertThat(rsl, lessThan(0));
  }

  @Test
  public void whenComparatorAscByNameAndDescPriority() {
    Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobDescByPriority());
    int rsl = cmpNamePriority.compare(
        new Job("Impl task", 0),
        new Job("Impl task", 1)
    );
    assertThat(rsl, greaterThan(0));
  }
}
