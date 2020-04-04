package com.daxing.design.model01.impl;

import com.daxing.design.model01.IStrategy;

/**
 * @author daxing.li
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
