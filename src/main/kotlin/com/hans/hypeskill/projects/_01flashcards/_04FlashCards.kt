package com.hans.hypeskill.projects._01flashcards

fun main() {
    println("Input the number of cards:")
    val numberOfCards = readLine()!!.toInt()
    var cards = mutableMapOf<String, String>()
    for (i in 1..numberOfCards) {
        println("Card #$i:")
        var term = readLine()!!
        while(term in cards.keys) {
            println("The term \"$term\" already exists. Try again:")
            term = readLine()!!
        }
        println("The definition for Card #$i:")
        var definition = readLine()!!
        while (definition in cards.values) {
            println("The definition \"$definition\" already exists. Try again:")
            definition = readLine()!!
        }
        cards[term] = definition
    }
    for((term, definition) in cards) {
        println("Print the definition of \"$term\":")
        val answer = readLine()!!
        println(if (answer == definition) "Correct!" else if (cards.containsValue(answer)) "Wrong. The right answer is \"$definition\", but your definition is correct for \"${cards.filter { it.value == answer }.firstNotNullOf { it.key }}\"." else "Wrong. The right answer is \"$definition\".")
    }

}
