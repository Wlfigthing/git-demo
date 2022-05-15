package com.example.designspringboot.Design.Memento.test;

import net.sf.json.util.JSONUtils;

public class Client {
    public static void main(String[] args) {
        System.out.println("===============大战即将开始===============");
        CareTaker careTaker = new CareTaker();
        System.out.println("请初始化角色");
        Person person = new Person("100","王炼","200");
        person.display();
        Memento1 memento1 = person.saveStateMemnto();//得到一个回忆对象
        careTaker.setMapIntoCareTaker(memento1);
        //
        System.out.println("=============得到倚天屠龙🗡============");
        person.display();
        Memento1 memento2 = person.saveStateMemnto();//得到一个回忆对象
        careTaker.setMapIntoCareTaker(memento2);
       //回到存档1
        Memento1 old = careTaker.getOldStateFromCareTaker("王炼", 0);
        person.getSateMemento(old);


    }
}
