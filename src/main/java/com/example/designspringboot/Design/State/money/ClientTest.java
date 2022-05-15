package com.example.designspringboot.Design.State.money;

/**������*/
public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建上下文对象
		Context context = new Context();
        //将当前状态设置为 PublishState
		context.setState(new PublishState());
        System.out.println(context.getCurrentState());
        
//        //publish --> not pay
        context.acceptOrderEvent(context);
//        //not pay --> paid
        context.payOrderEvent(context);
//        // 失败，检测失败时，会抛出异常
//        try {
//        	context.checkFailEvent(context);
//        	System.out.println("��������..");
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
        
	}

}
