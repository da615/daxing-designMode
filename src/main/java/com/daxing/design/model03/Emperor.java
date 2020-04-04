package com.daxing.design.model03;

/**
 * 皇帝
 */
public class Emperor {
    private static Emperor emperor = null;
    private Emperor(){

    }
    public static Emperor getInstance(){
        if(emperor ==null){
            emperor = new Emperor();
        }
        return emperor;
    }

    public static void emperorInfo(){
        System.out.println("皇帝康熙");
    }
}
