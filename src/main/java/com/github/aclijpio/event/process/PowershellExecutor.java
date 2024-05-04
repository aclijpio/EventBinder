package com.github.aclijpio.event.process;

import com.github.aclijpio.event.process.action.ActionCollection;
import org.apache.commons.exec.CommandLine;

public class PowershellExecutor extends CommandExecutor {


    protected PowershellExecutor(CommandLine commandLine) {
        super(commandLine);
    }

    @Override
    public Object execute(ActionCollection action) {
        return null;
    }

}
