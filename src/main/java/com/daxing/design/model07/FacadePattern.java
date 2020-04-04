package com.daxing.design.model07;

import com.daxing.design.model07.impl.LetterProcessImpl;

/**
 * 07门面模式
 *
 *
 */
public class FacadePattern {
    public static void main(String[] args) {
       /* LetterProcess letterProcess = new LetterProcessImpl();
        letterProcess.writeContext("I love you");
        letterProcess.fillEnvelope("GZ");
        letterProcess.letterInotoEnvelope();
        letterProcess.sendLetter();*/
       ModenPostOffice modenPostOffice = new ModenPostOffice();
        //你只要把信的内容和收信人地址给他，他会帮你完成一系列的工作；
        String address = "Happy Road No. 666,God Province,Heaven"; //定义一个地址
        String context = "Hello,It's me,do you know who I am? I'm your old lover. I'd like to....";
        modenPostOffice.sendLetter(context, address);

    }
}
