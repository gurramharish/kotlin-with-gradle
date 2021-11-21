package com.hans.hypeskill._06collections

// write a program to take unbounded strings until word stop is given,
// print the most frequent word or null if the first word is stop

fun main() {
    val words = mutableMapOf<String, Int>()
    while ("stop" !in words.keys) {
        val s = readLine()!!
        words[s] = if (s in words.keys) words[s]!! + 1 else 1
    }
    println(words.filter { it.key != "stop" }.maxByOrNull { it.value }?.key)
}