package com.github;

import java.util.ArrayList;
import java.util.List;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/22.
 * Version v1.0
 *
 * — 要求该命令执行这个请求。
 */
public class Invoker {

    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
        commands.add(command);
    }

    public void run(){
        for (Command command : commands) {
            command.execute();
        }
    }
}
