package com.hans.hypeskill.strings

fun main() {
    val s = readLine()!!
    println("${s.length} repetitions of the word $s: ${s.repeat(s.length)}")
}