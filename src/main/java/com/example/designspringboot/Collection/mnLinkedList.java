package com.example.designspringboot.Collection;

import java.util.LinkedList;

public class mnLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("www");
        Node wl = new Node("王炼");
        Node pjx = new Node("彭嘉欣");
        Node son = new Node("王嘉");
        wl.next = pjx;
        pjx.next = son;
        son.next = null;

        son.prev = pjx;
        pjx.prev = wl;
        wl.prev = null;

        Node first = wl;
        System.out.println("========顺序遍历========");
        while(true){

            if (first==null){
                break;
            }
            System.out.println((String) first.item);
            first = first.next;
        }
    }
}
class Node{
    public Object item;
    public Node prev;
    public Node next;

    public Node(Object item) {
        this.item = item;
    }



    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", prev=" + prev +
                ", next=" + next +
                '}';
    }
}