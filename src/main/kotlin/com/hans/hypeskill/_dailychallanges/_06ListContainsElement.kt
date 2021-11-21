package com.hans.hypeskill._dailychallanges

fun main() {
    val numbers = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    val m = readLine()!!.toInt()
    println(if (m in numbers) "YES" else "NO")
}