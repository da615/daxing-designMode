package com.daxing.design.model02.impl;

import com.daxing.design.model02.KindWomen;

/**
 * 定一个潘金莲是什么样的人
 * @author daxing.li
 */
public class PanJinLian implements KindWomen {

    @Override
    public void makeEyesWithMan() {
        System.out.println("潘金莲抛媚眼");
    }

    @Override
    public void happyWithMan() {
        System.out.println("潘金莲在和男人做那个.....");
    }


}
