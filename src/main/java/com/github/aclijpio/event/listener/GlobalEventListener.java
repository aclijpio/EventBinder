package com.github.aclijpio.event.listener;


import com.github.aclijpio.event.Event;
import com.github.aclijpio.event.EventList;
import com.github.aclijpio.event.listener.screens.GlobalScreenListener;

public class GlobalEventListener implements EventListener{
    GlobalScreenListener globalScreenListener = new GlobalScreenListener();

    @Override
    public void run() {
        globalScreenListener.execute();
    }

    public void addSingleEvent(Event event){
        globalScreenListener.eventList.add(event);
    }
    public void addPackageEvent(EventList eventList){
        globalScreenListener.eventList.addAll(eventList);
    }

}
