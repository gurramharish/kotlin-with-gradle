package com.hans.kotlin.fundametals._01_getting_started

import java.io.FileReader
import java.io.IOException
import java.nio.file.Path

fun main() {
    val q = division(10, 20)
    println("Q: $q")
    val q2 = division(10, 0)
    println("Q2: $q2")
    readFile()
}

fun division(n: Int, d: Int): Any {
    return try {
        n / d
    } catch (e: ArithmeticException) {
        "Denominator cannot be 0"
    }
}

fun readFile() {
    try {
        val reader = FileReader("input1.txt")
        println(reader.readText())
    } catch (e: IOException) {
        println("Unable to read file")
    } finally {
        println("Done!!")
    }
}