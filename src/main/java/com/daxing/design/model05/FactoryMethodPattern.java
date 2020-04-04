package com.daxing.design.model05;

import com.daxing.design.model05.impl.BlackHuman;
import com.daxing.design.model05.impl.WhiteHuman;
import com.daxing.design.model05.impl.YellowHuman;

/**
 * 04工厂模式
 * NvWa 女娲造人
 */
public class FactoryMethodPattern {

    public static void main(String[] args) {
        System.out.println("=================白人=");
        Human white = HumanFactory.createHuman(WhiteHuman.class);
        white.cry();
        white.laugh();
        white.talk();

        System.out.println("=================黑人=");
        Human black = HumanFactory.createHuman(BlackHuman.class);
        black.cry();
        black.laugh();
        black.talk();

        System.out.println("=================黄人=");
        Human yellow = HumanFactory.createHuman(YellowHuman.class);
        yellow.cry();
        yellow.laugh();
        yellow.talk();


    }
}
