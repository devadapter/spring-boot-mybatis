package com.devadapter.springbootmybatis;

/**
 * @author : zhangjie
 * @date : 2019-04-09 16:11
 */
public class Singleton {
    private Singleton() {}

    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
