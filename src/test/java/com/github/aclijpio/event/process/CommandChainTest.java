package com.github.aclijpio.event.process;

import com.github.aclijpio.event.process.builders.WindowsCommandBuilder;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.PumpStreamHandler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class CommandChainTest {

    DefaultExecutor defaultExecutor;
    DefaultExecuteResultHandler resultHandler;

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();


    @BeforeEach
    void setUp() {

        defaultExecutor = new DefaultExecutor.Builder<>().get();
        defaultExecutor.setStreamHandler(new PumpStreamHandler(outputStream));
        resultHandler =  new DefaultExecuteResultHandler();
    }

    @Test
    void executeWindowsCommandEcho() {
        CommandChain commandChain = new WindowsCommand().builder(windowsCommandBuilder -> windowsCommandBuilder
                .echo("Test")
                .build());

        commandChain.execute(defaultExecutor, resultHandler);

        Assertions.assertEquals("Test", outputStream.toString().trim());
    }
    @Test
    void executeWindowsCommandEchoWithExitValue(){
        CommandChain commandChain = new WindowsCommand().builder(windowsCommandBuilder -> windowsCommandBuilder
                .echo("Test with exit value")
                .build());

        commandChain.execute(defaultExecutor, resultHandler);
        Assertions.assertEquals("Test with exit value", outputStream.toString().trim());
        Assertions.assertEquals(0, resultHandler.getExitValue());
    }
    @Test
    void executeCommandChainEchoDouble() {
        CommandChain commandChain = new WindowsCommand().builder(windowsCommandBuilder -> windowsCommandBuilder
                .echo("first Text")
                .echo("second Text")
                .build());
        commandChain.execute(defaultExecutor, resultHandler);
        Assertions.assertEquals("Test with exit value", outputStream.toString().trim());
        Assertions.assertEquals(0, resultHandler.getExitValue());
    }
}