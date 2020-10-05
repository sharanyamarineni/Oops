package com.zemoso.creation;

interface CapInterface{
    public void add();
}
interface WaterInterface{
    public void water();
}
interface DesignInterface{
    public void addDesign();
}

abstract class Bottle {
    private String color;
    private int price;
    private String brand;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void addCap(){
        CapInterface cap=new Cap();
        cap.add();
    }

    public void addDesign(){
        System.out.println("bottle have design");
    }
    public void water(){
        System.out.println("water in a bottle");
    }
    public abstract void additionalPrice(int price);


}
