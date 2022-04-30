package com.example.tccdemo.services.impl;

import com.example.tccdemo.annotation.TccAction;
import com.example.tccdemo.services.Service;
import com.example.tccdemo.transaction.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author caroline
 */
@Component
@Slf4j
public class UserAccountServiceImpl implements Service {

    @Override
    @TccAction(name = "prepare", confirmMethod = "commit", cancelMethod = "cancel")
    public boolean prepare(boolean success) {
        log.info("user prepare");
        log.info("global transaction id:: " + RootContext.get());
        if (success) {
            log.info("User prepare success");
        } else {
            log.info("User prepare failed");
        }
        return success;
    }

    @Override
    public boolean commit() {
        log.info("User commit");
        log.info("global transaction id:: " + RootContext.get());
        return true;
    }

    @Override
    public boolean cancel() {
        log.info("User cancel");
        log.info("global transaction id:: " + RootContext.get());
        return true;
    }
}
