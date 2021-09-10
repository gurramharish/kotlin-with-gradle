package com.hans.kotlin.fundametals._02_functions_in_kotlin

fun main() {
    val message = "Hello    kotlin \t !!    :)"
    println(message.replaceMultiWhiteSpace())
}

fun String.replaceMultiWhiteSpace(): String {
    val regex = Regex("\\s+")
    return regex.replace(this, " ");
}