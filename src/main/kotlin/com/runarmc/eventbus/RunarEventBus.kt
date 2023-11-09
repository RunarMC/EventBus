package com.runarmc.eventbus

import com.google.common.eventbus.EventBus
import com.runarmc.eventbus.exceptions.RunarSubscriberExceptionHandler

class RunarEventBus : EventBus(RunarSubscriberExceptionHandler()) {
    override fun register(`object`: Any) {
        super.register(`object`)
        println("Registered Event Subscriber {}", `object`.javaClass.name)
    }
}