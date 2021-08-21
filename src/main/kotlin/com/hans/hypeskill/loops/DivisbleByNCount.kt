package com.hans.hypeskill.loops

fun main() {
    val (a, b, n) = Array(3) { readLine()!!.toInt() }
    var result = 0
    for (i in a..b) {
        when {
            i % n == 0 -> result++
        }
    }
    println(result)

    println("---------- Without looping ---------------")
    println(b/n - (a-1)/n)
}