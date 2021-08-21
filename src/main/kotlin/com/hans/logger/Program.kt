package com.rocksolidknowledge.stackunderflow

import com.hans.logger.Logger
import com.hans.logger.MapConfiguration

fun main() {
    val logger = Logger(MapConfiguration())

    // val filename = logger.createLog("./logs", "userlog");
    val filename = logger.createLog()
    println("Created: $filename")
}
