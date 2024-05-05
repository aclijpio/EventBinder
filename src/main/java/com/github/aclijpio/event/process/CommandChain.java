package com.github.aclijpio.event.process;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.Executor;

import java.io.IOException;
import java.util.List;

public class CommandChain {
    private final List<CommandLine> lines;

    public CommandChain(List<CommandLine> lines) {
        this.lines = lines;
    }



    private void executeCommand(CommandLine commandLine, Executor executor) {
        executor.setExitValue(0);

        try{
            executor.execute(commandLine);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void execute(Executor executor) {
        for (CommandLine commandLine : lines) {
            executeCommand(commandLine, executor);
        }
    }
}
