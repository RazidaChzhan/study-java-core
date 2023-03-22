package com.javastart.exceptions;

import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
    public static AccountRepository getINSTANCE;
    private static AccountRepository INSTANCE;
    private List<Account> accountList = new ArrayList<>();

    private AccountRepository() {
    }

    public static AccountRepository getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new AccountRepository();
        }
        return INSTANCE;
    }

    public void add(Account account) {
        accountList.add(account);
    }

    public Account getById(Long id) {
        for (Account account : accountList) {
            if (account.getId().equals(id)) {
                return account;
            }
        }
        throw new AccountNotFoundException("Can't find account with id: " + id);
    }
}
