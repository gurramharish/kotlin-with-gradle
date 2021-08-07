package com.hans.idiomatic.kotlin.series.day1

fun main() {


    val array = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val sum = 15
    val tripe = array.findTripleOfSum (sum).also(::println)




}