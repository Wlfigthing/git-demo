package com.example.designspringboot.Design.Memento.test;

import com.example.designspringboot.Design.Memento.test.Person;
import lombok.Data;

@Data
public class Memento1 {
    private String gjState;
    private String name;
    private String fyState;
    private String time;

    public Memento1(String gjState, String name, String fyState) {
        this.gjState = gjState;
        this.name = name;
        this.fyState = fyState;
    }

}
