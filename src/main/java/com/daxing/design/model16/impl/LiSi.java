package com.daxing.design.model16.impl;

import com.daxing.design.model16.ILiSi;
import com.daxing.design.model16.Observer;

public class LiSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("李斯:观察到韩非子活动，开始向老板汇报了...");
        this.reportToQiShiHuang(context);
        System.out.println("李斯：汇报完毕，秦老板赏给他两个萝卜吃吃...\n");
    }

    private void reportToQiShiHuang(String context) {
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->" + context);
    }
}
