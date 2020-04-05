package com.daxing.design.model16.impl;

import com.daxing.design.model16.Observable;
import com.daxing.design.model16.Observer;

import java.util.ArrayList;

public class HanFeiZi implements Observable {
    //定义个变长数组，存放所有的观察者
    private ArrayList<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void addObservable(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void deleteObservable(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservable(String context) {
        for(Observer observer:observerList){
            observer.update(context);
        }
    }

    //韩非子要吃饭了
    public void haveBreakfast(){
        System.out.println("韩非子:开始吃饭了...");
        //通知所有的观察者
        this.notifyObservable("韩非子在吃饭");
    }

    //韩非子开始娱乐了,古代人没啥娱乐，你能想到的就那么多
    public void haveFun(){
        System.out.println("韩非子:开始娱乐了...");
        this.notifyObservable("韩非子在娱乐");
    }
}
