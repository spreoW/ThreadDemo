package com.testReference;

/**
 * @author w
 * @date 2021/1/11
 */
public class C {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize");
    }
}
