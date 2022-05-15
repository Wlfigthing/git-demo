package com.example.designspringboot.Design.strategy.improve;

public class BadFlyBehavior implements FlyBeHavior {
    @Override
    public void fly() {
        System.out.println("飞翔技术不行");
    }
}
