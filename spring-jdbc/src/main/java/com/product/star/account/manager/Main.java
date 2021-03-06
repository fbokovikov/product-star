package com.product.star.account.manager;

import com.product.star.account.manager.config.ApplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        var accountDao = applicationContext.getBean(AccountDao.class);

        var account = accountDao.getAccount(1L);

        System.out.println(account);

        accountDao.setAmount(1L, 2000L);
        account = accountDao.getAccount(1L);
        System.out.println(account);

        var newAccount = accountDao.addAccount(10L,10000L);
        System.out.println(newAccount);

        var accounts = accountDao.getAllAccounts();
        System.out.println(accounts);
    }
}
