package com.example.designspringboot.Design.ResponsibilityChain;

public class DepartmentApprove extends Approve {

    public DepartmentApprove(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice()<=5000){
            System.out.println("请求编号 id= "+purchaseRequest.getId()+"被"+this.name+"处理");
        }else {
            approve.processRequest(purchaseRequest);
        }
    }
}
