package com.hans.hypeskill.loops

fun main() {
    val n = readLine()!!.toInt()
    if (n == 1) {
        println(readLine()!!.toInt())
    } else {
        var max1 = readLine()!!.toInt()
        var max2 = readLine()!!.toInt()
        repeat(n - 2) {
            val number = readLine()!!.toInt()
            if (number > max1) {
                max2 = max1
                max1 = number
            } else if (number > max2) {
                max2 = number
            }
        }
        println(max1 * max2)
    }

    val count = readLine()!!.toInt()
    val input = Array(count) { readLine()!!.toInt() }.sortedDescending()
    if (input.size == 1) {
        println(input[0])
    } else {
        println(input[0] * input[1])
    }
}