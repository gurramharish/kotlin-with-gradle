package com.hans.hypeskill._05MutableList

fun main() {
    val numbers = List(readLine()!!.toInt()) { readLine()!!.toInt() }
    val m = readLine()!!.toInt()
    println(numbers.count { it == m })
}