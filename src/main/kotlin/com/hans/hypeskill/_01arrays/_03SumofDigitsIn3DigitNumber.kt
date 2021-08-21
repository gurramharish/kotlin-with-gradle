package com.hans.hypeskill._01arrays

fun main() {
    val (a, b, c) = readLine()!!.split("").filter { it.isNotEmpty() }.map { it.toInt() }.toTypedArray()
    println("${a + b + c}")
}