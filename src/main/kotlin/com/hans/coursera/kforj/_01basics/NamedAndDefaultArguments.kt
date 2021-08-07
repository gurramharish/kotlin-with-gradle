@file:JvmName("Util")
package com.hans.coursera.kforj._01basics

fun main() {
    println(listOf('a', 'b', 'c').joinToString("", "{", "}"))

    // Named arguments
    println(listOf('1', '2', '3').joinToString(prefix = "{", separator = "+", postfix = "}"))

    // Named and default parameters
    println(listOf('1', '2', '3').joinToString(postfix = "."))
    displaySeparator()
    displaySeparator(size = 5)
    displaySeparator('_', 20)
    displaySeparator('+')
    sum(20, 30, 2).also {
        println()
        println(it)
    }
}

@JvmOverloads
fun sum(a: Int = 0, b: Int = 0, c: Int = 0) = a + b + c

fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}