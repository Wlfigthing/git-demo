package com.example.designspringboot.Design.strategy.improve;

public class NoFlyBehavior implements FlyBeHavior {
    @Override
    public void fly() {
        System.out.println("飞不了");
    }
}
