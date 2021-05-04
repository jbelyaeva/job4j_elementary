package ru.job4j.collection;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.junit.Test;

public class NotifyAccountTest {
  @Test
  public void sent() {
    List<Account> accounts = List.of(
        new Account("123", "Petr Arsentev", "eDer3432f"),
        new Account("142", "Petr Arsentev", "000001")
    );
    HashSet<Account> expect = new HashSet<>(
        List.of(
            new Account("123", "Petr Arsentev", "eDer3432f"),
            new Account("142", "Petr Arsentev", "000001")
        )
    );
    assertThat(NotifyAccount.sent(accounts), is(expect));
  }

  @Test
  public void sentSimilarPassport() {
    List<Account> accounts = List.of(
        new Account("123", "Petr Arsentev", "eDer3432f"),
        new Account("142", "Petr Arsentev", "000001"),
        new Account("142", "Petr Arsentev", "000002")
    );
    HashSet<Account> expect = new HashSet<>(
        List.of(
            new Account("123", "Petr Arsentev", "eDer3432f"),
            new Account("142", "Petr Arsentev", "000001")
        )
    );
    assertThat(NotifyAccount.sent(accounts), is(expect));
  }

  @Test
  public void sentSimilarDeposit() {
    List<Account> accounts = List.of(
        new Account("123", "Petr Arsentev", "eDer3432f"),
        new Account("142", "Petr Arsentev", "000001"),
        new Account("147", "Petr Arsentev", "000001")
    );
    HashSet<Account> expect = new HashSet<>(
        List.of(
            new Account("123", "Petr Arsentev", "eDer3432f"),
            new Account("142", "Petr Arsentev", "000001"),
            new Account("147", "Petr Arsentev", "000001")
        )
    );
    assertThat(NotifyAccount.sent(accounts), is(expect));
  }
}