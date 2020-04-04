package com.daxing.design.model01.impl;

import com.daxing.design.model01.IStrategy;

/**
 * @author daxing.li
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯,放行！");
    }
}
