package com.hans.hypeskill._01arrays

fun main() {

    // Imperative way
    val numbers = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    var max = Int.MIN_VALUE
    var index = 0
    for (i in numbers.indices) {
        if (max < numbers[i]) {
            max = numbers[i]
            index = i
        }
    }
    println(index)

    // Functional way
    numbers.maxOrNull()?.also { println(numbers.indexOf(it)) }
}