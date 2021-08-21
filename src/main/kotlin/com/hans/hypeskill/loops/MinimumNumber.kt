package com.hans.hypeskill.loops

import kotlin.math.min

fun main() {
    val n = readLine()!!.toInt()
    var response = Int.MAX_VALUE
    repeat(n) {
        response = min(response, readLine()!!.toInt())
    }
    println(response)

    println("============= Using List minOrNull ==========")

    println(List(readLine()!!.toInt()) { readLine()!!.toInt() }.minOrNull())
}
