package com.runarmc.eventbus;

public class StartEventBus {

    public static StartEventBus instance;

    public RunarEventBus eventBus;

    public StartEventBus() {
        this.eventBus = new RunarEventBus();
        System.out.println("[Patchy] EventBus is now listening.");
    }

    public static StartEventBus getInstance() {
        return instance;
    }

    public RunarEventBus getEventBus() {
        return eventBus;
    }
}
