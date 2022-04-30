package com.github.caroline.homework08.services;

import com.github.caroline.homework08.annotation.TccTransaction;
import com.github.caroline.homework08.services.impl.StoreAccountServiceImpl;
import com.github.caroline.homework08.services.impl.UserAccountServiceImpl;
import com.github.caroline.homework08.transaction.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author caroline
 */
@Slf4j
@Component
public class TransactionService {

    @Autowired
    private UserAccountServiceImpl user;

    @Autowired
    private StoreAccountServiceImpl store;

    @TccTransaction
    public void buySuccess() {
        log.info("global transaction id:: " + RootContext.get());
        if (!user.prepare(true)) {
            log.info("user try failed");
            throw new RuntimeException("user prepare failed!");
        }
        log.info("user try success");
        if (!store.prepare(true)) {
            log.info("store try failed");
            throw new RuntimeException("store prepare failed");
        }
        log.info("store try success");
    }

    @TccTransaction
    public void buyFailed() {
        log.info("global transaction id:: " + RootContext.get());
        if (!user.prepare(true)) {
            log.info("user try failed");
            throw new RuntimeException("user prepare failed!");
        }
        log.info("user try success");
        if (!store.prepare(false)) {
            log.info("store try failed");
            throw new RuntimeException("store prepare failed");
        }
        log.info("store try success");
    }
}
