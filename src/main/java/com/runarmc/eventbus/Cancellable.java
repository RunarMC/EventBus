package com.runarmc.eventbus;

public class Cancellable {
    private boolean cancelled = false;
    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelledIn) {
        this.cancelled = cancelledIn;
    }
}