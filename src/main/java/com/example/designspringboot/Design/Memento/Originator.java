package com.example.designspringboot.Design.Memento;

import lombok.Data;

@Data
public class Originator {
    private String state;//状态信息

    //编写一个方法，可以保存一个状态对象Memento
    public Memento saveStateMemento(){
        return new Memento(state);
    }
    //通过备忘录对象，恢复状态
    public void getStateFromMemento(Memento memento){
        state  = memento.getState();
    }
}
