package com.example.designspringboot.Design.Memento.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CareTaker {
   private static HashMap<String, List<Memento1>> map = new HashMap<>();

   public void setMapIntoCareTaker(Memento1 memento1){
      String name = memento1.getName();
      boolean tag = map.containsKey(name);
      if (tag){
         List<Memento1> memento1List = map.get(name);
         memento1List.add(memento1);
      }else{
         List<Memento1> memento1List = new ArrayList<>();
         memento1List.add(memento1);
         map.put(name,memento1List);
      }

   }

   public Memento1 getOldStateFromCareTaker(String name,int index){
      List<Memento1> memento1List = map.get(name);
      Memento1 memento1 = memento1List.get(index);
      return memento1;
   }
}
