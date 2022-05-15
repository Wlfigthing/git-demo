package com.example.designspringboot.Design.FlyWeight;

import lombok.Data;

@Data
public abstract class FlyWeight {
    private String color;//颜色
    private String des;//描述

    public FlyWeight(String color, String des) {
        this.color = color;
        this.des = des;
    }
}
