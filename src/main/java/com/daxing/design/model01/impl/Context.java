package com.daxing.design.model01.impl;

import com.daxing.design.model01.IStrategy;

/**
 * 锦囊
 * @author daxing.li
 */
public class Context {

    private IStrategy iStrategy;
    public Context(IStrategy iStrategy){
        this.iStrategy = iStrategy;
    }

    /**
     * 使用计谋了，看我出招了
     */
    public void operate(){
        this.iStrategy.operate();
    }
}
