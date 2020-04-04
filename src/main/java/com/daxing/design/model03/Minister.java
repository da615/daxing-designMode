package com.daxing.design.model03;

/**
 * 大臣
 */
public class Minister {

    public static void main(String[] args) {
        Emperor emperor1 = Emperor.getInstance();
        emperor1.emperorInfo();
        Emperor emperor2 = Emperor.getInstance();
        Emperor.emperorInfo();
        Emperor emperor3 = Emperor.getInstance();
        emperor3.emperorInfo();

    }
}
