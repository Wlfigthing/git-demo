package com.example.designspringboot.Design.Proxy.dynamic;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师开始教书啦~~");
    }


}
