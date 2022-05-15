package com.example.designspringboot.Design.Composite;

public class Client {
    public static void main(String[] args) {
        University university = new University("清华大学","垃圾大学");
        College college = new College("信息与计算科学","好专业");
        College college2 = new College("计算机科学与技术","垃圾专业");

        Projects projects1 = new Projects("算法与数据结构","难");
        Projects projects2 = new Projects("概率论","难");
        Projects projects3 = new Projects("高等代数","中等");
        Projects projects4 = new Projects("数学分析","简单");

        university.addComponent(college);
        university.addComponent(college2);
        college.addComponent(projects1);
        college.addComponent(projects3);
        college.addComponent(projects4);
        college2.addComponent(projects2);

        university.print();
    }

}
