package com.hans.hypeskill._dailychallanges

fun main() {
    val (days, foodCost, ticketFair, hotelChargesPerNight) = IntArray(4) { readLine()!!.toInt() }
    println(days * foodCost + 2 * ticketFair + (days - 1) * hotelChargesPerNight)
}