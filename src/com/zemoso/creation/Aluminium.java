package com.zemoso.creation;

public class Aluminium extends Bottle implements DesignInterface{
    Aluminium(String color,int price,String brand){
        this.setColor(color);
        this.setPrice(price);
        this.setBrand(brand);
    }
    public void addDesign(){
        System.out.println("Aluminium bottle have design");
    }

    @Override
    public void additionalPrice(int price) {
        this.setPrice(price*20);
    }
}
