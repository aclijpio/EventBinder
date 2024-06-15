package com.github.aclijpio.event.process.builders;

public enum WindowsCMD {

    ECHO() {
        @Override
        public String get() {
            return "echo ";
        }
    },
    OPEN(){
        @Override
        public String get(){
            return "start ";
        }
    };

    abstract public String get();

}
