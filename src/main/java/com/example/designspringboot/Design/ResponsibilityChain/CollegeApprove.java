package com.example.designspringboot.Design.ResponsibilityChain;

public class CollegeApprove extends Approve {
    public CollegeApprove(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice()<=10000){
            System.out.println("请求编号 id= "+purchaseRequest.getId()+"被"+this.name+"处理");
        }else {
            approve.processRequest(purchaseRequest);
        }
    }
}
