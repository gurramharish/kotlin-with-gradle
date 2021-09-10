package com.hans.hypeskill._02loops_arrays

fun main() {
    val beyondTheWall = mutableListOf("Harish Kumar", "Sai Kumar", "Dhikshan")
    val backFromTheWall = mutableListOf("Sai", "Harish", "Dhikshan", "H")
    println(beyondTheWall.containsAll(backFromTheWall))
    beyondTheWall.addAll(backFromTheWall)
    println(beyondTheWall.map { it.split(" ") }.flatMap { it.asSequence() }.toList().joinToString())
}