package com.example.designspringboot.Design.Composite;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public abstract class Component {
    private String name;//名称
    private String desc;//描述
    List<Component> componentList = new ArrayList<>();
    public  void print(){
        System.out.println("======"+this.name+"=======");
        for (Component component: componentList){
            component.print();
        }
    }
    public abstract void addComponent(Component component);
    public abstract void removeComponent(Component component);
    public Component(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
