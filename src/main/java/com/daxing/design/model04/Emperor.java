package com.daxing.design.model04;

import java.util.ArrayList;
import java.util.Random;

public class Emperor {

    //最多只有两个皇帝
    private static int maxNumOfEmperor = 2;
    //皇帝叫什么名字
    private static ArrayList emperorInfoList = new ArrayList(maxNumOfEmperor);
    //装皇帝的列表
    private static ArrayList emperorList = new ArrayList(maxNumOfEmperor);
    //正在被人尊称的是哪个皇帝
    private static int countNumOfEmperor = 0;

    //生成两个皇帝
    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new Emperor("皇帝" + (i + 1) + "个"));
        }
    }

    //就这么多皇帝了，不允许再推举一个皇帝(new 一个皇帝）
    private Emperor() {
        //世俗和道德约束你，目的就是不让你产生第二个皇帝
    }

    private Emperor(String info) {
        emperorInfoList.add(info);
    }

    public static Emperor getInstance(){
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return (Emperor) emperorList.get(countNumOfEmperor);
    }

    //皇帝叫什么名字
    public static void emperorInfo(){
        System.out.println(emperorInfoList.get(countNumOfEmperor));
    }

}
