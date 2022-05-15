package com.example.designspringboot.Design.Iterator;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {
    //学院的集合
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }
    public void printCollege(){
        Iterator<College> iterator = collegeList.iterator();
        while(iterator.hasNext()){
           College college = iterator.next();
            System.out.println("==="+college.getName()+"===");
            printDepartment(college.createIterator());
        }
    }

    public void printDepartment(Iterator iterator){
        while(iterator.hasNext()){
            Department d = (Department) iterator.next();
            System.out.println(d.getDesc());
        }
    }
}
