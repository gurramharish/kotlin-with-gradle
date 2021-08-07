package com.hans.idiomatic.kotlin.series.day2

fun main() {
    println("Password policy validation")
}

data class PasswordWithPolicy(
    val password: String,
    val range: IntRange,
    val letter: Char
) {
    companion object {
        fun parse(line: String) = PasswordWithPolicy (
            password = line.substringAfter(": "),
            letter = line.substringAfter(" ").substringBefore(":").single(),
            range = line.substringBefore(" ").let {
                val (start, end) = it.split("-")
                start.toInt()..end.toInt()
            }
        )
    }
}