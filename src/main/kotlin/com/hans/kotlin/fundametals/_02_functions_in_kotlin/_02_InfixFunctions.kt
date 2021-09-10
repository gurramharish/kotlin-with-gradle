package com.hans.kotlin.fundametals._02_functions_in_kotlin

fun main() {
    val h1 = Header("h1")
    val h2 = Header("h2")

    val h3 = h1 + h2
    println(h3.name)
}

data class Header(val name: String) {}

infix operator fun Header.plus(other: Header): Header {
    return Header("${this.name} ${other.name}")
}