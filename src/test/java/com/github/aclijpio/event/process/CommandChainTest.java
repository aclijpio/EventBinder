package com.github.aclijpio.event.process;

import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.PumpStreamHandler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class CommandChainTest {

    DefaultExecutor defaultExecutor;

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();


    @BeforeEach
    void setUp() {

        defaultExecutor = new DefaultExecutor.Builder<>().get();
        defaultExecutor.setStreamHandler(new PumpStreamHandler(outputStream));
    }

    @Test
    void executeWindowsCommandEcho() {
        CommandChain commandChain = new WindowsCommand().builder(windowsCommandBuilder -> windowsCommandBuilder
                .echo("Test")
                .build());

        commandChain.execute(defaultExecutor);
        Set<String> a  =  new HashSet<String>();
        a.add("test");

        Assertions.assertEquals("Test", outputStream.toString().trim());

    }
    @Test
    void executeCommandChainEchoDouble() {
        CommandChain commandChain = new WindowsCommand().builder(windowsCommandBuilder -> windowsCommandBuilder
                .echo("1")
                .echo("2")
                .echo("3")
                .build());
        commandChain.execute(defaultExecutor);
        Assertions.assertEquals("1\n2\n3", outputStream.toString().trim());
    }
}