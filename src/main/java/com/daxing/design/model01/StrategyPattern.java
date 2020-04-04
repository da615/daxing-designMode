package com.daxing.design.model01;

import com.daxing.design.model01.impl.BackDoor;
import com.daxing.design.model01.impl.Context;
import com.daxing.design.model01.impl.GivenGreenLight;

/**
 * 01策略模式
 * 策略模式的好处就是：体现了高内聚低耦合的特性呀，
 * 还有一个就是扩展性，也就是OCP原则，策略类可以继续增加下去，
 * 只要修改Context.java就可以了
 * @author daxing.li
 */
public class StrategyPattern {

    public static void main(String[] args) {
        Context context;
        System.out.println("----刚到东吴 第一个妙计");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("==============");

        System.out.println("----刘备乐无思蜀，第二个妙计");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("==============");

        System.out.println("----孙小妹阻追兵，第二个妙计");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("==============");

    }



}
