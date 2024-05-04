package com.github.aclijpio.event.process.action;

import java.util.ArrayList;
import java.util.List;

public class ActionCollection {

    List<String> actions =  new ArrayList<>();


    public void add(final String action) {
        actions.add(action);
    }
    public void addAll(final List<String> actions) {
        this.actions.addAll(actions);
    }

    public List<String> getActions() {
        return actions;
    }
}
