package com.runarmc.eventbus.exceptions;

import com.google.common.eventbus.SubscriberExceptionContext;
import com.google.common.eventbus.SubscriberExceptionHandler;

import java.lang.reflect.Method;

public class RunarSubscriberExceptionHandler implements SubscriberExceptionHandler {
    @Override
    public void handleException(Throwable exception, SubscriberExceptionContext context) {
        final Object event = context.getEvent();
        final Method method = context.getSubscriberMethod();
        System.out.println("[Patchy] Could not dispatch event " + event.getClass().getSimpleName()
                + " to " + method.getDeclaringClass().getName() + "." + method.getName() + "()");
        exception.printStackTrace();
    }
}
