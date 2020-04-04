package com.daxing.design.model06;

/**
 * 编写一个抽象类，根据enum创建一个人类出来
 */
public abstract class AbstractHumanFactory {
    public Human createHuman(HumanEnum humanEnum){
        Human human = null;
        if (!humanEnum.getValue().equals("")){
            try {
                human = (Human) Class.forName(humanEnum.getValue()).newInstance();
            }catch (Exception e){
                e.fillInStackTrace();
            }
        }
        return human;


    }
}
