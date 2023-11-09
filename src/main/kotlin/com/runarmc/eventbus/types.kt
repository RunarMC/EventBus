package com.runarmc.eventbus

fun println(message: String, arguments: String) {
    if (message.contains("{}"))
        message.replace("{}", arguments)
    println("[Patchy] $message")
}