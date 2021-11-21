package com.hans.kotlin.fundametals._03_programming_with_types

data class Meeting(val name: String, val location: String)

fun main() {
    val aMeeting = Meeting("A Meeting", "New York")
    val anotherMeeting = aMeeting.copy(location = "London")
}