package com.daxing.design.model16;

import com.daxing.design.model16.impl.HanFeiZi;
import com.daxing.design.model16.impl.LiSi;

public class Watch extends Thread {
    private HanFeiZi hanFeiZi;
    private LiSi liSi;
    private String type;

    public Watch(HanFeiZi hanFeiZi, LiSi liSi, String type) {
        this.hanFeiZi = hanFeiZi;
        this.liSi = liSi;
        this.type = type;
    }

    @Override
    public void run() {
       /* while (true) {
            if (this.type.equals("breakfast")) { //监控是否在吃早餐
                //如果发现韩非子在吃饭，就通知李斯
                if (this.hanFeiZi.isHaveBreakFast()) {
                    this.liSi.update("韩非子在吃饭");
                    //重置状态，继续监控
                    this.hanFeiZi.setHaveBreakfast(false);
                }
            } else {//监控是否在娱乐
                if (this.hanFeiZi.isHaveFun()) {
                    this.liSi.update("韩非子在娱乐");
                    this.hanFeiZi.setHaveFun(false);
                }

            }*/
    }
}
