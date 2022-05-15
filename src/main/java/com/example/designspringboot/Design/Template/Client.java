package com.example.designspringboot.Design.Template;

public class Client {
    public static void main(String[] args) {
        System.out.println("====制作红豆豆浆====");
        SoyaMilk redMilk = new RedBeanSoyaMilk();
        redMilk.make();
    }
}
