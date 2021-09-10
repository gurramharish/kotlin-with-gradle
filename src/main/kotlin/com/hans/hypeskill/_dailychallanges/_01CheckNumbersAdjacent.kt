package com.hans.hypeskill._dailychallanges

fun main() {
    val array = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    val (p, m) = readLine()!!.split(" ").map{ it.toInt() }.toTypedArray()
    var isAdjacent = "YES"
    for(i in 0 until array.size - 1) {
        if((array[i] == p && array[i + 1] == m) || (array[i] == m && array[i + 1] == p)) {
            isAdjacent = "NO"
            break
        }
    }
    println(isAdjacent)
}

// Same check using regex
fun withRegex() {
    val sizeOfList = readLine()!!.toInt()
    val baseString = List(sizeOfList) { readLine()!! }.joinToString("")
    val (p, m) = readLine()!!.split(" ")

    val isMatchedNextTo = """($p$m|$m$p)"""
        .toRegex()
        .containsMatchIn(baseString)

    if (!isMatchedNextTo) {
        println("YES")
    } else {
        println("NO")
    }
}