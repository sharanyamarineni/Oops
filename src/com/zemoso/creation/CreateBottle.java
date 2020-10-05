package com.zemoso.creation;

public class CreateBottle{
    Bottle b=null;
    public Bottle create(String type){
        if(type.equals("plastic")){
            b=new Plastic("green",50,"sprite");
        }
        else if(type.equals("aluminium")){
            b=new Aluminium("grey",200,"milton");
        }
        return b;
    }
}
