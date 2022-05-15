package com.example.designspringboot.Design.Iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator {
    //这里我们需要Department是以怎样的方式村南方
    List<Department> departmentsList;
    int position = -1;//遍历的位置

    public InfoCollegeIterator(List<Department> departmentsList) {
        this.departmentsList = departmentsList;
    }

    //判断是否含有下一个元素
    @Override
    public boolean hasNext() {
        if(position >= departmentsList.size()-1) {
            return false;
        }else {
            position+=1;
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departmentsList.get(position);
        position+=1;
        return department;
    }

    public void remove(){

    }
}
