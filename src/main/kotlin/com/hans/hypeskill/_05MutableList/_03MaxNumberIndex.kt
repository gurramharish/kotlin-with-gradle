package com.hans.hypeskill._05MutableList

fun main() {
    val numbers = List(readLine()!!.toInt()) { readLine()!!.toInt() }
    val max = numbers.maxOrNull()
    println(numbers.indexOf(max))
}