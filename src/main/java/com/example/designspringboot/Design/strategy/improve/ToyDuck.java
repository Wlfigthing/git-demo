package com.example.designspringboot.Design.strategy.improve;

public class ToyDuck extends Duck {
    @Override
    public void display() {
        flyBeHavior = new NoFlyBehavior();
    }
}
