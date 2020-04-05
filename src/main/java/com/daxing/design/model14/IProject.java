package com.daxing.design.model14;

public interface IProject {
    public String getProjectInfo();
    //增加项目
    public void add(String name,int num,int cost);
    //获得一个可以被遍历的对象
    public IProjectIterator iterator();
}
