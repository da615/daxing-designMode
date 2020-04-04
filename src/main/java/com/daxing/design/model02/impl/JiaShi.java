package com.daxing.design.model02.impl;

import com.daxing.design.model02.KindWomen;

/**
 * 贾氏
 * @author daxing.li
 */
public class JiaShi implements KindWomen {
    @Override
    public void makeEyesWithMan() {
        System.out.println("贾氏抛媚眼");
    }

    @Override
    public void happyWithMan() {
        System.out.println("贾氏正在Happy中......");
    }
}
