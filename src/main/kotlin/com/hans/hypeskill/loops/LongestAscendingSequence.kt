package com.hans.hypeskill.loops

fun main() {
    val n = readLine()!!.toInt()
    var answer = 1
    var r = 1
    var first = readLine()!!.toInt()
    for (i in 1 until n) {
        val next = readLine()!!.toInt()
        if (first <= next) {
            r++
        } else {
            answer = if (answer < r) r else answer
            r = 1
        }
        first = next
    }
    if (answer < r) println(r) else println(answer)
}