package com.github.aclijpio.event.process.builders;

import com.github.aclijpio.event.process.CommandChain;
import org.apache.commons.exec.CommandLine;


public class WindowsCommandBuilder implements CommandBuilder{


    CommandLine commandLine = new CommandLine("cmd").addArgument("/c");

    public WindowsCommandBuilder echo(final String text) {
        commandLine.addArgument(WindowsCMD.ECHO.get() + text);
        return this;
    }
    public WindowsCommandBuilder and(){
        commandLine.addArgument("&");
        return this;
    }
    @Override
    public CommandChain build(){
        return new CommandChain(commandLine);
    }

}
