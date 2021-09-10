package com.hans.hypeskill._02loops_arrays

import com.hans.coursera.kforj._03extensions.util.power

fun square(number: Int) = number.power(2)

fun main() {
    val number = readLine()!!.toInt()
    println(square(number))
    println(number.inc())
}