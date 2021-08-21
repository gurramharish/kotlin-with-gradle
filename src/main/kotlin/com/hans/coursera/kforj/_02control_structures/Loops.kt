package com.hans.coursera.kforj._02control_structures

// for, while, do-while

fun main() {

    // in for iteration
    val list = listOf<Char>('a', 'b', 'c')
    for(s in list) print(s)

    println()
    // in collection
    if('b' in list) {
        println("b is in the list")
    } else println("not in the list")

    // Iterating over map
    val map = mapOf(
        1 to "One",
        2 to "Two",
        3 to "Three"
    )

    for((key, value) in map) println("$key = $value")

    for((index, value) in list.withIndex()) println("$index = $value")

    // Ranges
    for(i in 1..9) {
        print(i)
    }
    println()
    for(i in 1 until 9) print(i)
    println()

    for(i in 9 downTo 1 step 3)
        print(i)
    println()

    for(i in 0..567 step 200) println(i)


    val c = 'B'
    isLetter(c).also { println("Is $c letter ${isLetter(c)}") }
    val digit = '8'
    isNotDigit(digit).also { println("$digit is ${if(it) "not digit" else "digit"}") }

    recognize(c).also(::println)

    val intRange: IntRange = 1..9
    val anotherIntRange = 1 until 10
    val charRange: CharRange = 'a'..'z'
    for(c in charRange) {
        println(c)
    }
    val stringRange: ClosedRange<String> = "ab".."l"
    ("kotlin" in stringRange).also { println("---------- $it") }
}

// in for checking whether value is in range
fun isLetter(character: Char) = character in 'a'..'z' || character in 'A'..'Z'

// not in a range
fun isNotDigit(c: Char) = c !in '0'..'9'

// in as when-condition
fun recognize(c: Char) = when(c) {
    in '0'..'9' -> "It's a digit!"
    in  'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know.."
}
