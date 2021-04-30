package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковского сервиса - перевод денежных средств с счета на счет
 * @author ULIA BELYAEVA
 * @version 1.0
 */

public class BankService {

  /**
   * Это поле содержит всех пользователей системы с привязанными к ним счетами.
   */
  private Map<User, List<Account>> users = new HashMap<>();

  /**
   * Метод добавляет пользователя в систему, принимая его на вход.
   * По умолчанию новому пользователю добавляется пустой список аккаунтов.
   * В методе осуществлена проверка на наличие пользователя в сиситеме : если он есть, то нового добавлять не надо.
   * @param user, который добавляется в систему
   */
  public void addUser(User user) {
    users.putIfAbsent(user, new ArrayList<Account>());
  }

  /**
   * Метод добавляет новый аккаунт пользователя, принимая на вход номер паспорта и счет.
   * Пользователь находится по паспорту, затем извлекается список всех счетов пользователя и
   * добавляется к ним новый счет.
   * В методе осуществлена проверка на отсутсвие такого счета у пользователя.
   * @param passport пользователя
   * @param account, который добавляется в систему
   */
  public void addAccount(String passport, Account account) {
    User user = findByPassport(passport);
    if (user != null) {
      List<Account> a = users.get(user);
      if (!a.contains(account)) {
        a.add(account);
      }
    }
  }

  /**
   * Метод ищет пользователя по номеру паспорта
   * @param passport пользователя
   * @return возвращает пользователя или null, если пользователь не найден
   */
  public User findByPassport(String passport) {
    return users.keySet().stream()
        .filter(u -> u.getPassport().equals(passport))
        .findFirst()
        .orElse(null);
  }

  /**
   * Метод ищет счет пользователя по реквизитам.
   * @param passport - паспорт пользователя
   * @param requisite - реквизиты пользователя
   * @return возвращает счет пользователя или null, если счет не найден
   */
  public Account findByRequisite(String passport, String requisite) {
    User user = findByPassport(passport);
    if (user != null) {
      List<Account> accounts = users.get(user);
      return accounts.stream()
          .filter(account -> account.getRequisite().equals(requisite))
          .findFirst()
          .orElse(null);
    }
    return null;
  }

  /**
   * Метод осуществляет перечисления денег с одного счёта на другой счёт
   * @param srcPassport - паспорт пользователя, с счета которого переводятся деньги
   * @param srcRequisite - реквизиты счета, с которого переводятся деньги
   * @param destPassport- паспорт пользователя, на счет которого переводятся деньги
   * @param destRequisite - реквизиты счета, на который переводятся деньги
   * @param amount - сумма перевода
   * @return - Если счёт не найден или не хватает денег на счёте srcAccount, то метод возвращает false
   */
  public boolean transferMoney(String srcPassport, String srcRequisite,
      String destPassport, String destRequisite, double amount) {
    boolean rsl = false;
    Account src = findByRequisite(srcPassport, srcRequisite);
    Account dest = findByRequisite(destPassport, destRequisite);
    if (src != null && dest != null && src.getBalance() >=  amount) {
      src.setBalance(src.getBalance() - amount);
      dest.setBalance(dest.getBalance() + amount);
      rsl = true;
    }
    return rsl;
  }
}
