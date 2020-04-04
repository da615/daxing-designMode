package com.daxing.design.model09;

public class HummerH2Model extends HummerModel {
    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛...");
    }
    @Override
    public void engineBoom() {
        System.out.println("悍马H2引擎声音是这样在...");
    }
    @Override
    public void start() {
        System.out.println("悍马H2发动...");
    }
    @Override
    public void stop() {
        System.out.println("悍马H2停车...");
    }

    //默认没有喇叭的
    @Override
    protected boolean isAlarm() {
        return false;
    }
}
