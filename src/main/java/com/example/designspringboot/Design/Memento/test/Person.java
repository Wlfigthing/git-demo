package com.example.designspringboot.Design.Memento.test;

import com.example.designspringboot.Design.Memento.Memento;
import lombok.Data;

@Data
public class Person {
    private String gjState;
    private String name;
    private String fyState;

    public Person(String gjState, String name, String fyState) {
        this.gjState = gjState;
        this.name = name;
        this.fyState = fyState;
    }

    public Memento1 saveStateMemnto(){
        return new Memento1(gjState,name,fyState);
    }
    public void getSateMemento(Memento1 memento1){
        gjState = memento1.getGjState();
        fyState = memento1.getFyState();
    }
    public void display(){
        System.out.println("当前的的战力值为："+(fyState+gjState));

    }

}
