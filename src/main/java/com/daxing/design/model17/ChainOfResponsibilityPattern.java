package com.daxing.design.model17;

import java.util.ArrayList;
import java.util.Random;

/**
 * 17观察者模式
 */
public class ChainOfResponsibilityPattern {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<IWomen>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(random.nextInt(4), "我要上街"));
        }
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        father.setNext(husband);
        husband.setNext(son);

        for (IWomen women : arrayList) {
            father.HandlerMessage(women);
        }
    }
}
