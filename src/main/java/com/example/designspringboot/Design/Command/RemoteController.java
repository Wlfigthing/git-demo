package com.example.designspringboot.Design.Command;

import lombok.var;

public class RemoteController {
    Command[] onCommand;
    Command[] offCommand;

    //执行撤销的命令
    Command undoCommand;

    public RemoteController() {
        onCommand = new Command[5];
        offCommand = new Command[5];
        for (int i = 0;i<5;i++){
            onCommand[i] = new NoCommand();
            offCommand[i] = new NoCommand();
        }
    }
    //给我们的按钮设置你需要的命令
    public void setCommand(int no,Command onCommand,Command offCommand) {
       this.onCommand[no] = onCommand;
       this.offCommand[no] = offCommand;
    }
    public void onDoCommand(int no){
        onCommand[no].execute();
        undoCommand = onCommand[no];
    }
    public void offCommand(int no){
        offCommand[no].execute();
        undoCommand = offCommand[no];
    }

    public void undoCommand(int no){
        undoCommand.undo();
    }
}
