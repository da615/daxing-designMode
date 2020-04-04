package com.daxing.design.model07;

import com.daxing.design.model07.impl.LetterProcessImpl;

/**
 * 只是增加了一个 police 变量的声明以及一个方法的调用，那这个写信的过程就变成了这样：先
 * 写信，然后写信封，然后警察开始检查，然后才把信放到信封，然后发送出去，那这个变更对客户来说，
 * 是透明的，他根本就看不到有人在检查他的邮件，他也不用了解，反正现代化的邮件都帮他做了，这也是
 * 他乐意的地方。
 */
public class ModenPostOffice {
    private LetterProcess letterProcess = new LetterProcessImpl();
    private Police police = new Police();
    //写信邮递一体化
    public void sendLetter(String context,String address){
        //帮你写信
        letterProcess.writeContext(context);

        //写好信封
        letterProcess.fillEnvelope(address);
        //额外新增逻辑
        police.checkLetter();

        //把信放到信封中
        letterProcess.letterInotoEnvelope();

        //邮递信件
        letterProcess.sendLetter();
    }
}
