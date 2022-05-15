package com.example.designspringboot.Design.ResponsibilityChain;

import org.springframework.web.servlet.DispatcherServlet;
import sun.plugin.com.Dispatcher;

public class Client {
    public static void main(String[] args) {
        //创建请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 30000, 1);
        //创建审批人
        DepartmentApprove departmentApprove = new DepartmentApprove("王主任");
        CollegeApprove collegeApprove = new CollegeApprove("娄院长");
        ViceSchoolMasterApprove viceSchoolMasterApprove = new ViceSchoolMasterApprove("hahah");
        SchoolMasterApprove schoolMasterApprove = new SchoolMasterApprove("shenhua1");
        departmentApprove.setApprove(collegeApprove);
        collegeApprove.setApprove(viceSchoolMasterApprove);
        viceSchoolMasterApprove.setApprove(schoolMasterApprove);
        schoolMasterApprove.setApprove(departmentApprove);
        //
        departmentApprove.processRequest(purchaseRequest);
    }
}
