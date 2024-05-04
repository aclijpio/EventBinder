package com.github.aclijpio.event.process;


import com.github.aclijpio.event.process.action.ActionCollection;
import org.apache.commons.exec.CommandLine;

public abstract class CommandExecutor {

    private final CommandLine commandLine;

    protected CommandExecutor(CommandLine commandLine) {
        this.commandLine = commandLine;
    }


    abstract Object execute(ActionCollection action);

    private void applyAction(final ActionCollection actions){
        for (String action  : actions.getActions()) {
            commandLine.addArgument(action);
        }
    }

}
