package com.hans.kotlin.fundametals._01_getting_started

class Person (var name: String) {
    fun displayName() {
        println("Name : $name")
    }

    fun displayWithLambda(func: (s: String) -> Unit): Unit {
        func(name)
    }
}

fun main() {
    val hans = Person("Harish")
    hans.displayName()

    hans.name = "Sai"
    hans.displayName()
    hans.displayWithLambda(::printName)
}

fun printName(name: String) {
    println("Lambda Name: $name")
}