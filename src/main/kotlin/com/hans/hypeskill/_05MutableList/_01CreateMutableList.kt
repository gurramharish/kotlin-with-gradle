package com.hans.hypeskill._05MutableList

fun main() {
    val numbers = MutableList(100) { index ->
        when(index) {
            0 -> 1
            9 -> 10
            99 -> 100
            else -> 0
        }
    }
    println(numbers.joinToString())
}