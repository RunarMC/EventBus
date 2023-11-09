package com.runarmc.eventbus

interface Event

fun <T : Event> T.post(): T {
    StartEventBus().getEventBus().post(this)
    return this
}