package com.daxing.design.model17;

public abstract class Handler {
    //能处理的级别
    private int level = 0;
    //责任传递，下一个责任人是谁
    private Handler newHandler;

    public Handler(int level){
        this.level = level;
    }
    public final void HandlerMessage(IWomen women){
        if(women.getType() == this.level){
            this.response(women);
        }else {
            if(this.newHandler != null){
                this.newHandler.HandlerMessage(women);
            }else {
                System.out.println("-----------不作处理--------");
            }
        }
    }

    public void setNext(Handler handler){
        this.newHandler = handler;
    }

    //有请示那当然要回应
    public abstract void response(IWomen women);
}
