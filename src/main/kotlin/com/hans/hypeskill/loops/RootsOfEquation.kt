package com.hans.hypeskill.loops

// a * x power 3 + b * x power 2 + c * x + d = 0

fun main() {
    val (a, b, c, d) = List<Int>(4) { readLine()!!.toInt() }
    for (x in 1..1000) {
        val r = a * (x * x * x) + b * (x * x) + c * x + d
        if (r == 0) {
            println(x)
        }
    }
}