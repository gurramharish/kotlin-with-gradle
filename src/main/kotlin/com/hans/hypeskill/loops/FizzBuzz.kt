package com.hans.hypeskill.loops

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    for (i in a..b) {
        when {
            i % 15 == 0 -> "FizzBuzz"
            i % 3 == 0 -> "Fizz"
            i % 5 == 0 -> "Buzz"
            else -> i
        }.also(::println)
    }
}