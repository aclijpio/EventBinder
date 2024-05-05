package com.github.aclijpio.event.process;


import com.github.aclijpio.event.process.builders.CommandBuilder;

import java.util.function.Consumer;

public interface CommandExecutor<T extends CommandBuilder>{

    CommandChain builder(Consumer<T> consumer);
}
