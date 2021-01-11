package com.testReference;

import java.lang.ref.SoftReference;

/**
 * @author w
 * @date 2021/1/11
 */
public class R2_SoftReference {
    public static void main(String[] args) throws InterruptedException {
        SoftReference<byte[]> softReference = new SoftReference<>(new byte[1024 * 1024 * 10]);
        System.out.println(softReference.get());
        System.gc();
        Thread.sleep(500);
        byte [] bytes = new byte[1024 * 1024 * 15];
        System.out.println(softReference.get());
    }
}
