package com.hans.hypeskill._01arrays

fun main() {
    val numbers = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    var triples = emptyArray<IntArray>()
    for (i in 0..numbers.size - 3) {
        triples += numbers.copyOfRange(i, i + 3)
    }
    println(triples.count { intArrayOf(it[0], it[0] + 1, it[0] + 2).contentEquals(it) })

    // Alternative Memory Efficient

    var counter = 0
    for (i in 0..numbers.size - 3) {
        if (numbers[i] + 1 == numbers[i + 1] && numbers[i + 1] + 1 == numbers[i + 2]) counter++
    }
    println(counter)
}