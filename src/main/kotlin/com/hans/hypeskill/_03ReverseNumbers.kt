package com.hans.hypeskill

fun main() {
    var number = readLine()!!.toInt()
    var result = ""
    while (number > 0) {
        result = "$result${number % 10}"
        number /= 10
    }
    println(result)

    println("--------------------------------")
    println(readLine()!!.reversed())

}

