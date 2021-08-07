package com.hans.idiomatic.kotlin.series.day1

import java.io.File

fun main() {
    val numbers = File("numbers.txt").readLines()
//        .map { it.toInt() }
        .map(String::toInt)

    println(numbers.associate { "key$it" to "value$it" })
    println(numbers.associateBy { "key$it" })
    println(numbers.associateWith { "value$it" })

    println("----------------------------")
    val sum = 2020
    val pair = numbers.findPairOfSum(sum)

    println("Pair of Combination : $pair")
    println("Product of pair is : ${pair?.let { (x, y) -> x * y }}")

    // y + z = 2020 - x
    val complementPairs: Map<Int, Pair<Int, Int>?> = numbers.associateWith { x ->
        numbers.findPairOfSum(sum - x)
    }
    println("Complement Pairs :$complementPairs")
    val triple = numbers.findTripleOfSum(sum)
    println("Triple combination is: $triple");
    println("Product of triple is : ${triple?.let { (x, y, z) -> x * y * z }}")
    /*if(triple != null) {
        println("Triple combination is : ${triple.first}, ${triple.second}, ${triple.third}")
        println("Product of triple is : ${triple.first * triple.second * triple.third}")
    }*/
}

fun List<Int>.findTripleOfSum(sum: Int) = firstNotNullOfOrNull { x ->
    findPairOfSum(sum - x)?.let { pair ->  Triple(x, pair.first, pair.second) }
}

fun List<Int>.findPairOfSum(sum: Int): Pair<Int, Int>? {
    val complements = associateBy { sum - it }
    return firstNotNullOfOrNull { key ->
      complements[key]?.let { c -> Pair(key, c) }
    }
}