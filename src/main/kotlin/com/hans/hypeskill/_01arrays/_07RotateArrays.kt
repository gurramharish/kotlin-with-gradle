package com.hans.hypeskill._01arrays

fun main() {
    val numbers = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    val shift = readLine()!!.toInt() % numbers.size
    val newNumbers = numbers.takeLast(shift) + numbers.take(numbers.size - shift)
    println(newNumbers.joinToString(separator = " "))

    // ---------- Imperative way
    var numbersCopy = numbers.copyOf()
    if (shift != 0) {
        repeat(shift) {
            var copy = emptyArray<Int>()
            copy += numbers.last()
            for (i in 0 until numbersCopy.size - 1) {
                copy += numbers[i]
            }
            numbersCopy = copy.toIntArray()
        }
    }
    println(numbersCopy.joinToString(separator = " "))
}