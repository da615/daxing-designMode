package com.daxing.design.model16.impl;

import com.daxing.design.model16.Observer;

public class LiuSi implements Observer {
    //王斯，看到韩非子有活动，自己就受不了
    public void update(String str){
        System.out.println("liu斯：观察到韩非子活动，自己也开始活动了...");
        this.happy(str);
        System.out.println("liu斯：真真的我快乐...\n");
    }

    //一看李斯有活动，就哭，痛哭
    private void happy(String context){
        System.out.println("liu斯：因为"+context+"，——所以我快乐呀！");
    }
}
