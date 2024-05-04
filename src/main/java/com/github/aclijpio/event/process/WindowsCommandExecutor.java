package com.github.aclijpio.event.process;

import com.github.aclijpio.event.process.action.ActionCollection;
import org.apache.commons.exec.CommandLine;

public class WindowsCommandExecutor extends CommandExecutor {
    public final CommandLine commandLine = new CommandLine("cmd /c");

    protected WindowsCommandExecutor(CommandLine commandLine) {
        super(commandLine);
    }

    @Override
    public Object execute(ActionCollection action) {

        return null;
    }

}
