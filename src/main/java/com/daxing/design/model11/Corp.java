package com.daxing.design.model11;

public abstract class Corp {

   /* protected abstract void produce();

    protected abstract void sell();

    public void makeMoney(){
        this.produce();
        this.sell();
    }*/

   private Product product;
   public Corp(Product product){
       this.product = product;
   }
   public void makeMoney(){
       this.product.beProduct();
       this.product.beSelled();
   }
}
