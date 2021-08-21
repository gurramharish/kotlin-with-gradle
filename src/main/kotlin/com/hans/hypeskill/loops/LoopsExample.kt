package com.hans.hypeskill.loops

fun main() {

    val k = 20
    println(k in 30 downTo 20)

    println("------------------------------------")
    for (i in 1..4) {
        println(i)
    }

    println("----------------------- Down To -----------------------")

    for(i in 4 downTo 1) {
        println(i)
    }


    // Not to use a..b when a > b

    for( i in 20..10) {
        println("Hello")
    }

    println("------------------ Excluding upper limit --------------")
    // Excluding the upper limit
    for ( i in 1 until 4) {
        println(i)
    }

    println("---------------------- Specifying step ----------------")
    for (i in 1..7 step 2) {
        println(i)
    }
    for(i in 7 downTo 1 step 2) {
        println(i)
    }

    println("------------------ Factorial of n -----------------------")
    val n = readLine()!!.toInt()
    var result = 1
    for(i in 2..n) {
        result *= i
    }
    println("Factorial of $n is : $result")

    println(" ------------- Multiple of even numbers --------------")

    for (i in 2..10 step 2) {
        for (j in 2..10 step 2) {
            print(i * j)
            print('\t')  // print the product of i and j followed by one tab
        }
        println()
    }

}