package com.daxing.design.model07;

/**
 * 写信过程
 */
public interface LetterProcess {
    //内容
    public void writeContext(String context);
    //写信
    public void fillEnvelope(String address);
    //把信放到信封里
    public void letterInotoEnvelope();
    //邮递
    public void sendLetter();

}
