package com.hans.coursera.kforj._01basics

// val read-only
// var mutable

fun main(args: Array<String>) {
    val greeting = "Hi!"
    var number = 0 // local type inference as int

    var name = "Harish"

    val languages = mutableListOf<String>("Java")
    languages.add("Kotlin")

    val list = listOf<String>("Java") // Kotlin by default create a immutable(read-only) list
    // Read-only list lacks mutating methods

}