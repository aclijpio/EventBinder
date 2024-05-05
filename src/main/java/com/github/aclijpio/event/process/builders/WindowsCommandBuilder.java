package com.github.aclijpio.event.process.builders;

import com.github.aclijpio.event.process.CommandChain;
import org.apache.commons.exec.CommandLine;

import java.util.ArrayList;
import java.util.List;


public class WindowsCommandBuilder implements CommandBuilder{
    List<CommandLine> commandLines = new ArrayList<>();


    //Ref

    private CommandLine getDefaultCommandLine(){
        return new CommandLine("cmd").addArgument("/c");
    }

    public WindowsCommandBuilder echo(final String text) {
        CommandLine command = getDefaultCommandLine().addArgument(WindowsCMD.ECHO.get() + text);

        addCommand(command);
        return this;
    }
    @Override
    public CommandChain build(){
        return new CommandChain(commandLines);
    }
    private void addCommand(CommandLine commandLine){
        this.commandLines.add(commandLine);
    }
}
