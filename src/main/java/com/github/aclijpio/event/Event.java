package com.github.aclijpio.event;


import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;

public class Event {

    private final int key;
    private final String command;

    public Event(int key, String command) {
        this.key = key;
        this.command = command;
    }
    public boolean correspondsTo(NativeKeyEvent e) {
        return key == e.getKeyCode();
    }
    public String getCommand() {
        return this.command;
    }
    public int getKey() {
        return this.key;
    }
}
