package com.daxing.design.model13;

public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }
    public void reportSort(){
        System.out.println("我的排名36");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
