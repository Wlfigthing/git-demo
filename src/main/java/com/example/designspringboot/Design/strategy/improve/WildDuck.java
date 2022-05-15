package com.example.designspringboot.Design.strategy.improve;

public class WildDuck extends Duck {
    public WildDuck() {
        flyBeHavior = new GoodFlyBehavior();

    }

    @Override
    public void display() {
        System.out.println("这是野鸭");
    }
}
