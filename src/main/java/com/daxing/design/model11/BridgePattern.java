package com.daxing.design.model11;

/**
 * 10桥梁模式
 * 业务抽象角色引用业务实现角色，或者说业务抽象角色的部分实现是由业务实现角色完成的
 * 优点就是类间解耦,桥梁模式描述了类间弱关联关系
 */
public class BridgePattern {

    public static void main(String[] args) {
       /* System.out.println("-------房地产公司是这个样子运行的-------");
        HouseCorp houseCorp = new HouseCorp();
        houseCorp.makeMoney();
        System.out.println("-------服装公司是这样运行的-------");
        ClothesCorp clothesCorp = new ClothesCorp();
        clothesCorp.makeMoney();

        System.out.println("-------山寨公司是这样运行的-------");
        IPodCorp iPodCorp = new IPodCorp();
        iPodCorp.makeMoney();*/
        House house = new House();
        System.out.println("-------房地产公司是这个样子运行的-------");
        //先找到我的公司
        HouseCorp houseCorp =new HouseCorp(house);
        //看我怎么挣钱
        houseCorp.makeMoney();
        System.out.println("\n");

        //山寨公司生产的产品很多，不过我只要指定产品就成了
        System.out.println("-------山寨公司是这样运行的-------");
        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new Clothes());
        shanZhaiCorp.makeMoney();

        //山寨公司生产的产品很多，不过我只要指定产品就成了
        System.out.println("-------山寨公司是这样运行的22-------");
        ShanZhaiCorp shanZhaiCorp1 = new ShanZhaiCorp(new IPod());
        shanZhaiCorp1.makeMoney();
    }
}
