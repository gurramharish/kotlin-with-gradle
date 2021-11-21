package com.hans.hypeskill._06collections

fun main() {
    val letters = mutableMapOf<Int, Char>()
    while(letters[letters.size] != 'z') { letters[letters.size + 1] = readLine()!!.first() }
    println(letters[4])
}