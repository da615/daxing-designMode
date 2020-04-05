package com.daxing.design.model19;

/**
 * 19状态模式
 */
public class StatePattern {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());

        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
