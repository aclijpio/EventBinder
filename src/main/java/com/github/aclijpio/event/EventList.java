package com.github.aclijpio.event;



import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;

import java.util.HashMap;
import java.util.Optional;

public class EventList {

    private final HashMap<Integer, Event> events = new HashMap<>();

    public void add(Event event) {
        this.events.put(event.getKey(), event);
    }
    public void addAll(EventList eventList) {
        this.events.putAll(eventList.events);
    }
    public void remove(Event event) {
        this.events.remove(event.getKey());
    }
    public Optional<Event> matchEvent(NativeKeyEvent key) {
        if (!this.events.containsKey(key.getKeyCode())) return Optional.empty();
        return Optional.of(this.events.get(key.getKeyCode()));
    }
}
