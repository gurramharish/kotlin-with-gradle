package com.hans.hypeskill._03functions

fun isVowel(c: Char) = c.lowercaseChar() in charArrayOf('a', 'e', 'i', 'o', 'u')

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}