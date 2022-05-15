package com.example.designspringboot.Design.Observe.improve;

public interface Subject {
    public void registerOnserve(Observe o);
    public void removeOnserve(Observe o);
    public void notifyOnserve();
}
