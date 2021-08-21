package com.hans.hypeskill._01arrays

fun main() {
    val n = readLine()!!.toInt()
    val numbers = IntArray(n) { readLine()!!.toInt() }
    val m = readLine()!!.toInt()
    println(numbers.count { m == it })
}