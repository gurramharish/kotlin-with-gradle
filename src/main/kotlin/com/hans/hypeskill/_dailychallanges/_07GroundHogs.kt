package com.hans.hypeskill._dailychallanges

fun main() {
    val cups = readLine()!!.toInt()
    val range = if (readLine()!!.toBoolean()) 15..25 else 10..20
    println(cups in range)
}