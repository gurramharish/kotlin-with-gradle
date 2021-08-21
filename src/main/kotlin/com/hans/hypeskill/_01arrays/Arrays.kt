package com.hans.hypeskill._01arrays

fun main() {

    val array = intArrayOf(1, 2, 3, 4, 5, 6)

    // Read 5 integers from standard input
//    val array2 = IntArray(5) { readLine()!!.toInt() }

//    var array3 = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

    val regex = "\\s+".toRegex() // With this regular expression, you can ignore spaces and tabs in the input string
    val str = "1 2\t\t3  4\t5  6"
    val nums = str.split(regex).map { it.toInt() }.toTypedArray()

    val numbers1 = intArrayOf(1, 2, 3, 4)
    val numbers2 = intArrayOf(1, 2, 4, 3)
    println("Content Equals ${numbers1.contentEquals(numbers2)}")

}