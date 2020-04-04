package com.daxing.design.model09;

/**
 * 09模板方法模式
 * 模板方法模式就是在模板方法中按照一个的规则和顺序调用基本方法，
 * 具体到我们上面那个例子就是 run 方法按照规定的顺序(先调用 start,然后再调用 engineBoom，再调用
 * alarm，最后调用 stop)调用本类的其他方法，并且由 isAlarm 方法的返回值确定 run 中的执行顺序变更，
 * 模板方法是通过汇总
 * 或排序基本方法而产生的结果集
 *
 **/
public class TemplateMethodPattern {
    public static void main(String[] args) {
       /* //客户开着H1型号，出去遛弯了
        HummerModel h1 = new HummerH1Model();
        h1.run(); //汽车跑起来了；

        //客户开H2型号，出去玩耍了
        HummerModel h2 = new HummerH2Model();
        h2.run();*/

        //客户开着H1型号，出去遛弯了
        HummerH1Model h1 = new HummerH1Model();
        h1.setAlarm(true);
        h1.run(); //汽车跑起来了；
    }
}
