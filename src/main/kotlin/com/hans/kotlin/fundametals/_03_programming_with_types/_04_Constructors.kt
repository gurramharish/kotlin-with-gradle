package com.hans.kotlin.fundametals._03_programming_with_types

open class User(val name: String)

val hans = User("Harish Kumar")

// Initializing using init method
open class Pet(_name: String) {
    val name: String
    init {
        this.name = _name
    }
    fun doSomething() {
        println("My Name is $name")
    }
}

open class Tree(_name: String) {
    val name = _name
}

// Secondary constructor
open class Person1(name: String) {
    constructor(name: String, age: Int) : this(name)
}

// Default values in constructor
open class Person2(val name: String, age: Int = 0) {

}

val p = Person2("Harish", 30)
val p1 = Person2("Sai")

// Calling super class constructor
class Student1(name: String): Person1(name) {

}
 class Student2: Person2 {
     constructor(name: String): super(name)
 }

fun main() {
    print(p.name)
}