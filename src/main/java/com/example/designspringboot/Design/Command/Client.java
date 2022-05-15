package com.example.designspringboot.Design.Command;

public class Client {
    public static void main(String[] args) {
        LightReceiver receiver = new LightReceiver();
        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(receiver);
        LightOffCommand lightOffCommand = new LightOffCommand(receiver);
        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        remoteController.onDoCommand(0);
        remoteController.offCommand(0);
        remoteController.undoCommand(0);
    }
}
