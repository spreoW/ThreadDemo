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
        //����GC�ͻᱻ����
        System.out.println(weak.get());
    }
}
