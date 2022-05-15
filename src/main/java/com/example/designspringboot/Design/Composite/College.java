package com.example.designspringboot.Design.Composite;

public class College extends Component {

    public College(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void addComponent(Component component) {
        super.componentList.add(component);
    }

    @Override
    public void removeComponent(Component component) {
        super.componentList.remove(component);
    }
}
