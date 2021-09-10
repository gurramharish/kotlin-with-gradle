package com.hans.hypeskill.tricky

import com.hans.hypeskill.tricky.SplitMap.splitFlat

object SplitMap {

    fun Map<String, String>.splitFlat() = this.map { (k, v) -> k.split(",").map { it to v } }
        .flatMap { it.asSequence() }.toMap()

    val recordTypes = mapOf(
        "01, 02, 03" to "Order",
        "07, 08" to "Position"
    )
}

fun main() {
    SplitMap.recordTypes.splitFlat().let(::println)
}