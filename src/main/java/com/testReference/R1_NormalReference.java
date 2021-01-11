package com.testReference;

/**
 * @author w
 * @date 2021/1/11
 */
public class R1_NormalReference {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c);
        System.gc();
        System.out.println(c);

        c = null;
        System.gc();
        System.out.println(c);
    }
}
