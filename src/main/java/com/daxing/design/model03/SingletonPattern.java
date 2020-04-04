package com.daxing.design.model03;

/**
 * 03单例模式：
 */
public class SingletonPattern {
    private static final SingletonPattern singletonPattern = new SingletonPattern();

    //限制不能直接产生一个实例
    private SingletonPattern() {
    }

    public synchronized SingletonPattern getInstance() {
        return singletonPattern;
    }
}
