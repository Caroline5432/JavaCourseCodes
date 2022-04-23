package com.github.caroline.homework08.annotation;

import java.lang.annotation.*;

/**
 * 用于全局事务的注册处理
 * @author
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TccTransaction {
}
