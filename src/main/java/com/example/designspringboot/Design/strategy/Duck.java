package com.example.designspringboot.Design.strategy;

public abstract class Duck {
    public Duck() {
    }
    public void quack(){
        System.out.println("鸭子嘎嘎叫~~");
    }
    public void swim(){
        System.out.println("鸭子会游泳");
    }
    public void fly(){
        System.out.println("鸭子会飞翔");
    }
    public abstract void display();//显示鸭子的信息
}
