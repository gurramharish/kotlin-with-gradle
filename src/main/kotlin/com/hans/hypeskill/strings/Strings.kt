package com.hans.hypeskill.strings

fun main() {
    val s = "Harish Kumar"
    s.first().also(::println)
    s.last().also(::println)
    s.lastIndex.also(::println)

    "".isEmpty().also(::println)
    " ".isBlank().also(::println)
    s[3].dec().also(::println)
}