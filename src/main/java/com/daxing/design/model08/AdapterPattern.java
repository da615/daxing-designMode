package com.daxing.design.model08;

/**
 * 08适配器模式
 * 适配器模式不适合在系统设计阶段采用，没有一个系统分析师会在做详设的时候考虑使用适配器模式，
 * 这个模式使用的主要场景是扩展应用中，就像我们上面的那个例子一样，系统扩展了，不符合原有设计的
 * 时候才考虑通过适配器模式减少代码修改带来的风险。
 */
public class AdapterPattern {

    public static void main(String[] args) {
        //IUserInfo iUserInfo = new UserInfo();
        IUserInfo iUserInfo = new OuterUserInfo();
        for (int i = 0;i<100;i++){
            iUserInfo.getMobileNumber();
        }
    }



}
