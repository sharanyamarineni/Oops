package com.zemoso.creation;

public class MainProg {
    public static void main(String[] args) {
        String type="plastic";
        CreateBottle cb=new CreateBottle();
        Bottle p=cb.create(type);
        System.out.println(p.getColor());
        System.out.println(p.getPrice());
        p.addCap();
        p.addDesign();
        p.additionalPrice(20);
        System.out.println(p.getPrice());
        p.water();
        p.addDesign();

    }
}
