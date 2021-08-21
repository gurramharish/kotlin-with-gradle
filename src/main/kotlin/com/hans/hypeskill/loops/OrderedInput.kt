package com.hans.hypeskill.loops

fun main() {
    val input = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    val sorted = input.sorted().toIntArray()
    if (sorted.contentEquals(input)) {
        println("YES")
    } else println("NO")
}