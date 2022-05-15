package com.example.designspringboot.Lambda;

import com.example.designspringboot.User;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestLambda {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("ssss");
        User user = new User();
        List<User> lists = new ArrayList<User>();
        lists.add(user);
        lists.stream().map((x)->x.getUserAge());
        //Supplier<String> supplier = ()-> user.getUserAge();

    }
}
