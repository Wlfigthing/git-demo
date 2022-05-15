package com.example.designspringboot.Design.Memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    //在list集合中会有很多的备忘录对象
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    //获取到第几个的备忘录对象
    public Memento getMementoFromList(int index){
        return mementoList.get(index);
    }
}
