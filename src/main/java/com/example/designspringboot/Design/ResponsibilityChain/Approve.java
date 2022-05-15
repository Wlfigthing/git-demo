package com.example.designspringboot.Design.ResponsibilityChain;

import lombok.Data;

@Data
public abstract class Approve {
    Approve approve;
    String name;//名字

    public Approve(String name) {
        this.name = name;
    }

    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
