package com.github.aclijpio.event;

import com.github.aclijpio.event.listener.GlobalEventListener;

public class EventFabric {

    private final GlobalEventListener globalEventListener;


    public EventFabric(GlobalEventListener globalEventListener) {
        this.globalEventListener = globalEventListener;
    }

    public void apply(){
        this.globalEventListener.run();
    }

}
