package com.daxing.design.model05;

import java.util.List;

/**
 * 实现类
 */
public class HumanFactory {

    public static Human createHuman(Class c) {
        Human human = null;//定义一个人型

        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            System.out.println("必须指定人的肤色");
        } catch (IllegalAccessException e) {
            System.out.println("人类定义错误");
        } catch (ClassNotFoundException e) {
            System.out.println("指定的人类找不到");
        }
        return human;
    }

    public static Human createHuman(){
        Human human = null;
        /*List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(Human.class);*/
        return null;
    }
}
