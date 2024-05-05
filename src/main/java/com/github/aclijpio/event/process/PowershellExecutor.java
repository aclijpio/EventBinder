package com.github.aclijpio.event.process;

import com.github.aclijpio.event.process.builders.PowershellBuilder;

import java.util.function.Consumer;

public class PowershellExecutor implements CommandExecutor<PowershellBuilder> {


    @Override
    public CommandChain builder(Consumer<PowershellBuilder> consumer) {
        return null;
    }


}
