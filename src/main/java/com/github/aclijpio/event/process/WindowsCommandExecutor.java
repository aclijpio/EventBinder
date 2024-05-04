package com.github.aclijpio.event.process;

import org.apache.commons.exec.CommandLine;

public class WindowsCommandExecutor implements CommandExecutor{
    private static final CommandLine commandLine = new CommandLine("cmd /c");
    @Override
    public Object execute() {




        return null;
    }


/*    public void test() {
        CommandLine commandLine = new CommandLine("cmd");
        commandLine.addArgument("/c");
        commandLine.addArgument("echo");
        commandLine.addArgument("Hello");
        commandLine.addArgument("World");

        DefaultExecutor executor = new DefaultExecutor.Builder<>().get();

        executor.setExitValue(0);
        try {
            executor.execute(commandLine);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }*/
}
