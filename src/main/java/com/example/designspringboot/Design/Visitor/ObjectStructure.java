package com.example.designspringboot.Design.Visitor;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {
    //维护了一个集合
    private List<Person> personList = new LinkedList<>();

    public void attach(Person p){
        personList.add(p);

    }
    public void detach(Person p){
        personList.remove(p);
    }

    public void display(Action action){
        for(Person p:personList){
            p.accept(action);
        }
    }
}

