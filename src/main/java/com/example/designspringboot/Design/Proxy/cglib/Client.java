package com.example.designspringboot.Design.Proxy.cglib;


import com.example.designspringboot.Design.Proxy.dynamic.ITeacherDao;

public class Client {
    public static void main(String[] args) {
        TeacherDao target = new TeacherDao();
        TeacherDao proxyIntercept =(TeacherDao) new ProxyFactory(target).getProxyInstance();
        //执行代理对象的方法，触发intercept方法，从而实现对目标对象的调用
        proxyIntercept.teach();


    }
}
