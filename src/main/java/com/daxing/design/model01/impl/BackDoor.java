package com.daxing.design.model01.impl;

import com.daxing.design.model01.IStrategy;

/**
 * @author daxing.li
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
