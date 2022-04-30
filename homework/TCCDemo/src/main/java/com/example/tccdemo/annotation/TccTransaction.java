package com.example.tccdemo.annotation;

import java.lang.annotation.*;

/**
 * 用于全局事务的注册处理
 * @author caroline
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TccTransaction {
}
