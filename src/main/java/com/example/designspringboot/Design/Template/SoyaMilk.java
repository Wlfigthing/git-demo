package com.example.designspringboot.Design.Template;

public abstract class SoyaMilk {
    //模板方法，不让子类去修改
    final void make(){
        select();
        addCondiments();
        soak();
        beat();
    }
    //选材料
    void select(){
        System.out.println("选黄豆");
    }
    //添加不同的配料，抽象方法，子类具体实现
    abstract void addCondiments();
    //浸泡
    void soak(){
        System.out.println("开始浸泡");
    }
    //打碎
    void beat(){
        System.out.println("打黄豆");
    }
    //钩子方法，决定是否加入配料
}
