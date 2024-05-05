package com.github.aclijpio.event.process;

import com.github.aclijpio.event.process.builders.WindowsCommandBuilder;

import java.util.function.Consumer;

public class WindowsCommand implements CommandExecutor<WindowsCommandBuilder>{


    @Override
    public CommandChain builder(Consumer<WindowsCommandBuilder> consumer){
        WindowsCommandBuilder builder = new WindowsCommandBuilder();
        consumer.accept(builder);
        return builder.build();
    }
}
