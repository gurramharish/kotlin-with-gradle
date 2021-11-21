package com.hans.hypeskill._06collections

fun main() {
    val letter = readLine()!!.first().lowercaseChar()
    val vowels = mapOf('a' to 1, 'e' to 5, 'i' to 9, 'o' to 15, 'u' to 21)
    println(if (letter in vowels.keys) vowels[letter] else 0)
}