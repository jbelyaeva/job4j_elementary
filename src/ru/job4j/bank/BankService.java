package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {

  private Map<User, List<Account>> users = new HashMap<>();

  public void addUser(User user) {
    users.putIfAbsent(user, new ArrayList<Account>());
  }

  public void addAccount(String passport, Account account) {
    User user = findByPassport(passport);
    if (user != null) {
      List<Account> a = users.get(user);
      if (!a.contains(account)) {
        a.add(account);
      }
    }
  }

  public User findByPassport(String passport) {
    for (User u : users.keySet()) {
      if (u.getPassport().equals(passport)) {
        return u;
      }
    }
    return null;
  }

  public Account findByRequisite(String passport, String requisite) {
    User user = findByPassport(passport);
    if (user != null) {
      List<Account> accounts = users.get(user);
      for (Account account : accounts) {
        if (account.getRequisite().equals(requisite)) {
          return account;
        }
      }
    }
    return null;
  }

  public boolean transferMoney(String srcPassport, String srcRequisite,
      String destPassport, String destRequisite, double amount) {
    boolean rsl = false;
    Account src = findByRequisite(srcPassport, srcRequisite);
    Account dest = findByRequisite(destPassport, destRequisite);
    if (((src != null) && (dest != null)) || (src.getBalance() > amount)) {
      src.setBalance(src.getBalance() - amount);
      dest.setBalance(dest.getBalance() + amount);
      rsl = true;
    }
    return rsl;
  }
}
