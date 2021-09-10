package com.hans.kotlin.fundametals._01_getting_started

fun main() {
    println(getNumberType(10))
    println(getNumberType(9))
}

fun getNumberType(num: Int): String {
    return when {
        num % 2 == 0 -> "Even"
        else -> "Odd"
    }
}

