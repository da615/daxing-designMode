package com.daxing.design.model12;

public class Invoker {
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void action(){
        this.command.execute();
    }
}
