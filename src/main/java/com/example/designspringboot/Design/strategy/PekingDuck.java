package com.example.designspringboot.Design.strategy;

public class PekingDuck extends Duck{
    @Override
    public void display() {
        System.out.println("北京鸭~~");
    }

    @Override
    public void fly() {
        System.out.println("北京鸭飞不起来");
    }

}
