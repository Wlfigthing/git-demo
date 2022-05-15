package com.example.designspringboot.Design.Visitor;

public class WoMan extends Person {

    @Override
    public void accept(Action action) {
        action.getWoManResult(this);
    }
}
