package com.example.designspringboot.Design.strategy.improve;

import java.util.Arrays;
import java.util.Comparator;

public class client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        WildDuck wildDuck2 = new WildDuck();
        wildDuck.fly();
        wildDuck.equals(wildDuck2);


    }
}
