package com.zemoso.creation;

public class Plastic extends Bottle implements WaterInterface,DesignInterface{
    Plastic(String color,int price,String brand){
        this.setColor(color);
        this.setPrice(price);
        this.setBrand(brand);
    }
    @Override
    public void additionalPrice(int price){
        this.setPrice(price*10);
    }


    public void water() {
        System.out.println("water added in plastic bottle");
    }

    @Override
    public void addDesign() {
        System.out.println("plastic design");
    }
}
