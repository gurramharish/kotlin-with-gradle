package com.hans.files

import java.io.File
import java.nio.file.Paths

private val inputFileName = "input.txt"

// Reading all the text from file
fun readFullFileAsString(): String {
    return Paths.get("", inputFileName).toFile().readText()
}

// Read a file line by line
fun readLineByLine() {
    Paths.get("", inputFileName).toFile().forEachLine { println(it) }
}

// Read all the lines of file into List of String
fun readFileUsingUseLines(fileName: String): List<String> {
    return Paths.get("", fileName).toFile().useLines { it.toList() }
}

fun main(args: Array<String>) {

    val path = System.getProperty("user.dir")

    println("Working Directory = $path")

    val currentPath = Paths.get("").toAbsolutePath().toString()
    println("Current working path : $currentPath")

    val fromFile = readFullFileAsString()
    println("Text from File is :: $fromFile")
    println("-------------------------------------")
    readLineByLine()
    val listOfLines: List<String>? = readFileUsingUseLines(inputFileName);
    println("List of lines :: $listOfLines")

    println("$&$&$&$&$&$&$&$&$&$&$&$&$&$&$&$&$&$&$&$&$&$&$&$&$&$&")
    val file: File? = File(inputFileName)
    println("Reading file directly :: ${file?.readText()}")
}

class FileA {
    fun readFileUsingGetResource(fileName: String) = this::class.java.getResource(fileName).readText(Charsets.UTF_8)

    fun readFileAsLinesUsingGetResourceAsStream(fileName: String) =
        this::class.java.getResourceAsStream(fileName).bufferedReader().readLines()
}
