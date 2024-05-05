package com.github.aclijpio.event.process;

import org.apache.commons.exec.*;

import java.io.IOException;

public class CommandChain {
    private final CommandLine commandLine;


    public CommandChain(CommandLine commandLine) {
        this.commandLine = commandLine;
    }

    public void execute(Executor executor){
        executor.setExitValue(0);

    }


    public int execute(Executor executor, DefaultExecuteResultHandler resultHandler) {
        executor.setExitValue(0);

        try{
            executor.execute(commandLine, resultHandler);
            resultHandler.waitFor();
            return resultHandler.getExitValue();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
