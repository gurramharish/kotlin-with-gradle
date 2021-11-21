package com.hans.hypeskill._06collections

fun main() {
    val map = mutableMapOf(1 to "Harish", 2 to "Sai", 3 to "Srinu", 4 to "Anand")
    for((key, value) in map) {
        println("$key : $value")
    }
}