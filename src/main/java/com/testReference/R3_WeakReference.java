package com.testReference;

import java.lang.ref.WeakReference;

/**
 * @author w
 * @date 2021/1/11
 */
public class R3_WeakReference {
    public static void main(String[] args) {
        WeakReference<C> weak = new WeakReference<>(new C());
        System.out.println(weak.get());
        System.gc();
        //遇到GC就会被回收
        System.out.println(weak.get());
    }
}
