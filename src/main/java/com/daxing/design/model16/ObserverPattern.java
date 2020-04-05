package com.daxing.design.model16;

import com.daxing.design.model16.impl.HanFeiZi;
import com.daxing.design.model16.impl.LiSi;
import com.daxing.design.model16.impl.LiuSi;
import com.daxing.design.model16.impl.WangSi;

/**
 * 16观察者模式
 * 定义两个接口 观察者和被观察者，及对应的实现类，在被观察者实现类中添加构造函数，
 * 把观察者作为属性传入，并在构造函数中调用观察者的方法。
 *
 */
public class ObserverPattern {
    public static void main(String[] args) throws InterruptedException {
        //三个观察者产生出来
        Observer liSi = new LiSi();
        Observer wangSi = new WangSi();
        Observer liuSi = new LiuSi();

        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObservable(liSi);
        hanFeiZi.addObservable(wangSi);
        hanFeiZi.addObservable(liuSi);
        hanFeiZi.haveBreakfast();


    }
}
