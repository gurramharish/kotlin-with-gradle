package com.hans.hypeskill._04exceptions

fun main() {
    val cardNumber = "3456 4567 1234 2345"
    println(parseCardNumber(cardNumber))
}

fun parseCardNumber(cardNumber: String): Long {
    if (cardNumber.matches("\\d{4} \\d{4} \\d{4} \\d{4}".toRegex())) {
        return cardNumber.replace(" ", "").toLong()
    } else {
        throw Exception("Invalid card number : $cardNumber")
    }
}