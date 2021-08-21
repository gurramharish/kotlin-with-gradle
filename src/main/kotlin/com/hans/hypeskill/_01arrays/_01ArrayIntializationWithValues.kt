package com.hans.hypeskill._01arrays

fun main() {
    val numbers = IntArray(100) {
        if (it == 0 || it == 9 || it == 99) it + 1 else 0
    }
    val numbers2 = IntArray(100) {
        if (it in intArrayOf(0, 9, 99)) it + 1 else 0
    }
    println(numbers.joinToString())
    println(numbers2.joinToString())
}