package com.daxing.design.model12;

/**
 * 12命令模式
 * 三个角色：
 * Receiver 角色：这个就是干活的角色，命令传递到这里是应该被执行的，具体到上面我们的例子中就是
 * Group 的三个实现类；
 * Command 角色：就是命令，需要我执行的所有命令都这里声明；
 * Invoker 角色：调用者，接收到命令，并执行命令，例子中我这里项目经理就是这个角色；
 * 命令模式比较简单，但是在项目中使用是非常频繁的，封装性非常好，因为它把请求方（Invoker）和执
 * 行方（Receiver）分开了，扩展性也有很好的保障。但是，命令模式也是有缺点的，你看 Command 的子类没
 * 有，那个如果我要写下去的可不是几个，而是几十个，这个类膨胀的非常多，这个就需要大家在项目中自己考虑
 * 使用了
 */
public class CommandPattern {

    public static void main(String[] args) {
        /*//首先客户找到需求组说，过来谈需求，并修改
        System.out.println("-------------客户要求增加一个需求-----------------");
        Group rg = new RequirementGroup();
        //找到需求组
        rg.find();

        //增加一个需求
        rg.add();

        //要求变更计划
        rg.plan();*/

        Invoker xiaosan = new Invoker();
        System.out.println("增加需求");
        //Command command = new AddRequirementCommand();
        //就修改了这么多，就完成了一个命令的，是不是很简单，而且客户也不用知道
        //到底要谁来修改，这个他不需要知道的，高内聚的要求体现出来了，这就是命令模式。
        Command command = new DeletePageCommand();
        xiaosan.setCommand(command);
        xiaosan.action();

    }

}
