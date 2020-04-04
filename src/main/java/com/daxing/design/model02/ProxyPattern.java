package com.daxing.design.model02;

import com.daxing.design.model02.impl.JiaShi;
import com.daxing.design.model02.impl.WangPo;

/**
 * 02代理模式
 * 什么是代理模式呢？
 * 我很忙，忙的没空理你，那你要找我呢就先找我的代理人吧，
 * 那代理人总要知道被代理人能做哪些事情不能做哪些事情吧，
 * 那就是两个人具备同一个接口，代理人虽然不能干活，但是被代理的人能干活呀。
 *
 * 总结：，代理模式主要使用了Java的多态，干活的是被代理类，代理类主要是接活，
 * 你让我干活，好，我交给幕后的类去干，你满意就成，那怎么知道被代理类能不能干呢？
 * 同根就成，大家知根知底，你能做啥，我能做啥都清楚的很，同一个接口呗。
 *
 * @author daxing.li
 */
public class ProxyPattern {

    public static void main(String[] args) {
        //王婆
        WangPo wangPo = new WangPo();
        //西门庆大哥找happy,王婆代理
        wangPo.happyWithMan();
        wangPo.makeEyesWithMan();

        //西门庆勾引贾氏
        System.out.println("===============");
        JiaShi jiaShi = new JiaShi();
        WangPo wangPo2 = new WangPo(jiaShi);
        wangPo2.makeEyesWithMan();
        wangPo2.happyWithMan();
    }
}
