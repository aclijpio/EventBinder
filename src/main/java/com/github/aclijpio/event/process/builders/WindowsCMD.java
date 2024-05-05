package com.github.aclijpio.event.process.builders;

public enum WindowsCMD {

    ECHO() {
        @Override
        public String get() {
            return "echo ";
        }
    };

    abstract public String get();

}
