package com.example.designspringboot.Design.strategy.improve;

public class GoodFlyBehavior implements FlyBeHavior {
    @Override
    public void fly() {
        System.out.println("飞翔技术高超");
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("===========================");
        return true;
    }
}
