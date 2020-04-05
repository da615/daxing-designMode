package com.daxing.design.model20;

import java.util.Random;

/**
 * 20原型模式
 * 原型模式先产生出一个包含大量共有信息的类，然后可以拷贝出副本，修正细节信息，建立了一个完
 * 整的个性对象。
 *
 * ps:浅拷贝与深拷贝
 * 因为 Java 做了一个偷懒的拷贝动作，Object 类提供的方法 clone 只是拷贝本对象，
 * 其对象内部的数组、引用对象等都不拷贝，还是指向原生对象的内部元素地址，这种拷贝就叫做浅拷贝，
 * 确实是非常浅，两个对象共享了一个私有变量，你改我改大家都能改，是一个种非常不安全的方式，在实
 * 际项目中使用还是比较少的。
 *
 * 完全的拷贝，两个对象之间没有任何的瓜葛了，你修改你的，我修改我的，不相互影响，
 * 这种拷贝就叫做深拷贝，
 *
 *
 */
public class PrototypePattern {
    private static int MAX_COUNT = 6;

    public static void main(String[] args) throws CloneNotSupportedException {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("xx银行版权所有！");
        while (i < MAX_COUNT) {
            Mail mailClone = (Mail) mail.clone();
            mailClone.setAppellation(getRandString(5) + " 先生（女士）");
            mailClone.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
            sendMail(mailClone);
            i++;
        }
    }

    private static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();

    }

    private static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人："
                + mail.getReceiver() + "\t....发送成功！");
    }
}
