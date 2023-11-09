package com.runarmc.eventbus.events.client

import com.runarmc.eventbus.Cancellable
import com.runarmc.eventbus.Event

class ApplicationStartEvent(val isDeveloperMode: Boolean) : Cancellable(), Event