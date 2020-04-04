package com.daxing.design.model13;

/**
 * 13装饰者模式
 * 对继承的有力补充，你要知道继承可不是万能的，继承可以解决实际的问题，
 * 优点，扩展性非常好，
 *
 */
public class DecoratorPattern {

    public static void main(String[] args) {
        /*SchoolReport sr = new SugarFouthGradeSchoolReport();
        sr.report();
        sr.sign("dada");*/
        SchoolReport sr;
        sr = new FouthGradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);
        sr.report();
        sr.sign("Dada");

    }
}
