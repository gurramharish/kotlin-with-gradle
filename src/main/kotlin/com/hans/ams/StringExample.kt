package com.hans.ams

import com.hans.files.readFullFileAsString
import java.nio.file.Paths

fun main(args: Array<String>) {
    val temperature = 51
    val message = "Yor are ${if(temperature > 50) "fried" else "safe"} fish"
    println(message)

    val json = """
        {
            "name": "Harish",       
            age:30         
        }
    """.trimIndent()
    println(json)


    val name = """
        Harish,
        Spring Boot,                                                 
        Hello World!!
    """.trimIndent()

    println("Hello $name")
    print("Your name is ${name.count()} long")


    // buildString
    val myText: String = buildString {
        repeat(10) {
            append("Hello, ")
            append(name)
            appendLine("!")
        }
    }

    println("My text is :: $myText")

    // Extracting information from String
    println("\"\" is empty ${"".isEmpty()}")
    println("\"    \" is blank ${"   ".isBlank()}")

    val blank = "   "
    val nonBlank = blank.ifBlank { "Non Blank String!!" }
    println("Surprise: $nonBlank")

    // Split String into array using delimiter
    val input = "A: B: C: D: E"
    println(input.split(":").map {it.trim()}.map { it.length })

    // reading multi line string into list of strings
    val multiLine = """
        Kotlin is awesome!!
        I am loving it :)
    """.trimIndent()
    println(multiLine.lines())

    // We can call map, filter on strings also
    println("Hello".filter { it.isLowerCase() })
}

