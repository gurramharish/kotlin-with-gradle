package com.hans.hypeskill._01arrays

fun main() {
    val stringArray = arrayOf("Harish", "Kumar", "Gurram")

    val mixArray = arrayOf(1, "Harish", 2L, 22.0f)

    // To achieve strict typing
    val intArray = arrayOf<Int>(1, 2, 3, 4, 5, 6, 7)

    var emptyArray = emptyArray<String>()
    emptyArray += "Harish"

}