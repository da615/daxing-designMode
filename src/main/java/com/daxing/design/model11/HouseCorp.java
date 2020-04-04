package com.daxing.design.model11;

public class HouseCorp extends Corp {
   /* @Override
    protected void produce() {
        System.out.println("房地产公司盖房子...");
    }

    @Override
    protected void sell() {
        System.out.println("房地产公司出售房子...");
    }

    public void makeMoney(){
        super.makeMoney();
        System.out.println("房地产挣大钱了");
    }*/

   public HouseCorp(House house){
       super(house);
   }

    //房地产公司很High了，赚钱，计算利润
    public void makeMoney(){
        super.makeMoney();
        System.out.println("房地产公司赚大钱了...");
    }
}
