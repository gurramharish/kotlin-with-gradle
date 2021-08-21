package com.hans.hypeskill._01arrays

fun main() {
    val numbers = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    println(if (a in numbers && b in numbers) "YES" else "NO")
}