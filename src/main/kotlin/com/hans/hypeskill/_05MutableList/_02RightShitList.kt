package com.hans.hypeskill._05MutableList

fun main() {
    val numbers = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    numbers.add(0, numbers.removeLast())
    println(numbers.joinToString(" "))
}