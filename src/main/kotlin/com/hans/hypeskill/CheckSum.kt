package com.hans.hypeskill

fun main() {
    val numbers = List(3) { readLine()!!.toInt() }
    val complements = numbers.associateBy { 20 - it }
    val pair: Pair<Int, Int>? = numbers.firstNotNullOfOrNull { key -> complements[key]?.let { c -> key to c } }
    println(pair != null && pair.first != pair.second)
}