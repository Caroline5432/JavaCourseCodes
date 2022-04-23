package com.github.caroline.homework08.transaction;

/**
 * thread local save xid
 * @author
 */
public class RootContext {

    private final static ThreadLocal<String> TCC_THREADLOCAL = new ThreadLocal<>();

    public static String get() {
        return TCC_THREADLOCAL.get();
    }

    public static void set(String id) {
        TCC_THREADLOCAL.set(id);
    }

    public static void remove() {
        TCC_THREADLOCAL.remove();
    }
}
