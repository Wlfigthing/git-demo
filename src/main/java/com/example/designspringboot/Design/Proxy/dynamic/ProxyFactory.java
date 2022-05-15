package com.example.designspringboot.Design.Proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private ITeacherDao teacherDao;

    public ProxyFactory(ITeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(teacherDao.getClass().getClassLoader(),
                teacherDao.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始~~");
                        //反射机制调用目标对象的方法
                        Object returnVal = method.invoke(teacherDao,args);
                        return returnVal;
                    }
                });
    }
}
