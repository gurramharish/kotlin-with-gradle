package com.hans.ams

import java.util.*

fun main(args: Array<String>) {
    dayOfWeek()
    val temperature = 51
    val isHot = temperature > 50
    println(isHot)

    val message = "Yor are ${if(temperature > 50) "fried" else "safe"} fish"
    println(message)
}

fun dayOfWeek() {
    val cal = Calendar.getInstance()
    cal.set(2021, 5, 5)
    println(
    when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK).also(::println)) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    })
}