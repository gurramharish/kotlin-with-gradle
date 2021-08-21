package com.hans.coursera.kforj._02control_structures

import com.hans.coursera.kforj._02control_structures.Color.*

enum class Color {
    RED, BLUE, GREEN
}

fun main() {
    // if is a expression in Kotlin, means if will return a value which can be
    // assigned to variable
    // No ternary operator in kotlin
    val a = 10
    val b = 30
    if(a > b) a else b.also { println("Max value is $it") }
    println("Weather is  ${getDescription(RED)}")
    println("Yes, ${respondToInput("y")}")
    println("Mix RED and BLUE ${mix(RED, BLUE).name}")
//    println("Mix RED and BLUE ${mix(GREEN, BLUE).name}")
    speak(Cat())
    speak(Dog())
    getSound()
    val (desc, color) = getWeather(20)
    println("Weather is $desc and the color code is ${color.name}")
}

// When is like a switch in java
// But no break required
fun getDescription(color: Color): String =
    when (color) {
        BLUE -> "Cold"
        RED -> "Hot"
        GREEN -> "Mild"
    }

// We can match one of the value in the when cases
// values seperated by comma
fun respondToInput(input: String): String =
    when(input) {
        "y", "Y", "yes", "Yes", "YES" -> "I am glad you agreed"
        "n", "N", "no", "No", "NO" -> "Sorry to hear that"
        else -> "I don't understand you"
    }

// Any expression can be used as a branch condition
fun mix(c1: Color, c2: Color) =
    when(setOf<Color>(c1, c2)) {
        setOf(BLUE, RED) -> GREEN
        setOf(RED, GREEN) -> BLUE
        else -> throw Exception("Dirty color")
    }


// Checking Types in when condition
fun speak(pet: Pet) = when(pet) {
    is Cat -> pet.meow()
    is Dog -> pet.woof()
    else -> throw Exception("Cant speak!!")
}

fun myFavouritePet(): Pet = Dog()

// capturing when subject in variable
fun getSound() = when(val pet = myFavouritePet()) {
    is Cat -> pet.meow()
    is Dog -> pet.woof()
    else -> throw Exception("Cant speak!!")
}

// Checking conditions: when without arguments
fun getWeather(degrees: Int): Pair<String, Color> = when {
        degrees < 5 -> "cold" to BLUE
        degrees < 23 -> "mild" to GREEN
        else -> "hot" to RED
    }
