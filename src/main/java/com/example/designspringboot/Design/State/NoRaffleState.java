package com.example.designspringboot.Design.State;

/**
 * ���ܳ齱״̬
 * @author Administrator
 *
 */
public class NoRaffleState extends State {

	 // ��ʼ��ʱ�������ã��۳����ֺ�ı���״̬
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    // ��ǰ״̬���Կۻ��� , �۳��󣬽�״̬���óɿ��Գ齱״̬
    @Override
    public void deductMoney() {
        activity.setState(activity.getCanRaffleState());
    }

    // ��ǰ״̬���ܳ齱
    @Override
    public boolean raffle() {
        System.out.println("���˻��ֲ��ܳ齱ร�");
        return false;
    }

    // ��ǰ״̬���ܷ���Ʒ
    @Override
    public void dispensePrize() {
        System.out.println("���ܷ��Ž�Ʒ");
    }
}
