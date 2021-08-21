package com.hans.hypeskill._02loops_arrays

fun main() {
    val daysOfWeek = arrayOf("Sun", "Mon", "Tues", "Wed", "Thur", "Fir", "Sat")

    for (day in daysOfWeek) {
        println(day)
    }

    // Iterating through indencies
    for (index in daysOfWeek.indices) {
        println("$index : ${daysOfWeek[index]}")
    }
}