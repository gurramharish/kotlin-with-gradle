package com.hans.hypeskill._05MutableList

fun main() {
    val numbers = List(readLine()!!.toInt()) { readLine()!!.toInt() }
    var count = 0;
    for (i in 0..numbers.size - 3) {
        if(numbers[i] + 1 == numbers[i + 1] && numbers[i + 1] + 1 == numbers[i + 2]) count++
    }
    println(count)
}