package com.github.aclijpio.event.listener.screens;

import com.github.aclijpio.event.EventList;
import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;
import com.github.kwhat.jnativehook.mouse.NativeMouseEvent;
import com.github.kwhat.jnativehook.mouse.NativeMouseListener;

public class GlobalScreenListener implements NativeKeyListener, NativeMouseListener {

    public final EventList eventList = new EventList();

    public void execute() {
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            System.exit(1);
        }
        GlobalScreen.addNativeKeyListener(this);
        GlobalScreen.addNativeMouseListener(this);
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {

        System.out.println("Key Pressed: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {

        if (eventList.matchEvent(e).isPresent()){
            System.out.println("********* Cong");
        }

        System.out.println("Key Released: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {
        System.out.println("Key Typed: " + e.getKeyChar());
    }

    @Override
    public void nativeMouseClicked(NativeMouseEvent nativeEvent) {
        System.out.println("Mouse clicked: " + nativeEvent.getPoint() );
    }

    @Override
    public void nativeMousePressed(NativeMouseEvent nativeEvent) {
        System.out.println("Mouse pressed: " + nativeEvent.getPoint() );
    }

    @Override
    public void nativeMouseReleased(NativeMouseEvent nativeEvent) {
        System.out.println("Mouse released: " + nativeEvent.getPoint() );
    }
}
