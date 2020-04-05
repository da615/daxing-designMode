package com.daxing.design.model16;

/**
 * 所有被观察者者，通用接口
 */
public interface Observable {
    public void addObservable(Observer observer);
    public void deleteObservable(Observer observer);
    public void notifyObservable(String context);
}
