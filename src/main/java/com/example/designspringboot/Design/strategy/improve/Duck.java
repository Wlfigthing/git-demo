package com.example.designspringboot.Design.strategy.improve;

public abstract class Duck {
    FlyBeHavior flyBeHavior;
    public Duck() {
    }
    public void fly(){
        if(flyBeHavior!=null){
            flyBeHavior.fly();
        }else{
            System.out.println("祖先鸭子会飞翔");

        }
    }
    public abstract void display();//显示鸭子的信息
}
