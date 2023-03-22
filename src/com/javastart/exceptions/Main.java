package com.javastart.exceptions;

public class Main {
    public static void main(String[] args) {
        AccountRepository accountRepository = AccountRepository.getINSTANCE();
        Account account1 = new Account(1L, "Lori1", 10000);
        Account account2 = new Account(2L, "Lori2", 20000);
        Account account3 = new Account(3L, "Lori3", 30000);

        accountRepository.add(account1);
        accountRepository.add(account2);
        accountRepository.add(account3);


        Account account = accountRepository.getById(6L);
    }
}
