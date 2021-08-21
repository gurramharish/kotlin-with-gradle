package com.hans.coursera.kforj._03extensions.util

import com.hans.coursera.kforj._03extensions.lastChar

fun main() {
    "Harish".lastChar().let(::println)

    val set = hashSetOf(1, 7, 53)
    val list = listOf(1, 10, 20, 11, 21, 300)
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
    println(list.maxOrNull())

    // Int extension function power
    println("2 to the power of 3 ${2 power  3}")
    println("4 power 4 ${4 power  4}")

    val multiLine = """Multi line
        |String
    """.trimMargin().also { println(it) }

    val indentString = """
        Ram: Hello Harish! Good Morning!!
        Harish: Good Morning Ram!
        Ram:How are you doing ?
        Harish: I am doing great!!
    """.trimIndent().also(::println)

    val question = "life, the universe, and everything"
    val answer = 42

    val tripleQuotedString = """
    #question = "$question"
    #answer = $answer""".trimMargin("#")
    println(tripleQuotedString)


    (getPatternDDMMMYYYY().toRegex() matches "12 MAR 1990").also { println("Date matches : $it") }

}

const val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPatternDDMMMYYYY(): String = """\d{2} $month \d{4}"""

fun getPatternDDMMYYYY() = """\d{2}\.\d{2}\.\d{4}"""


infix fun Int.power(power: Int): Int {
    var result = this
    for(c in 1 until power) {
        result *= this
    }
    return result
}

