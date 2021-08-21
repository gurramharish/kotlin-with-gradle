package com.hans.hypeskill

fun main() {
    val list = List<Int>(2) { generator() }
    println("List size : ${list.size} and elements : $list")
    val f: Double = 20.0 + 20.0f
    val l: Long = 10 + 2L
    val n = readLine()!!.toInt()
    print("${n % 10}${n / 10 % 10}${n / 100}")
}

fun generator(): Int = (100..200).random()