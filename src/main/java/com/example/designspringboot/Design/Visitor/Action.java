package com.example.designspringboot.Design.Visitor;

public abstract class Action {
    //得到男性的评价
    public abstract void getManResult(Man man);
    //得到女性的评价
    public abstract void getWoManResult(WoMan man);
}
