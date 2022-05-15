package com.example.designspringboot.Design.strategy.improve;

public class PekingDuck extends Duck {
    public PekingDuck() {
        flyBeHavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("北京鸭~~");
    }

}
