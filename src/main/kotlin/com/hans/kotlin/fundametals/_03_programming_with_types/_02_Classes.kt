package com.hans.kotlin.fundametals._03_programming_with_types

// final by default
abstract class Person {
    var firstName = ""
    var lastName = ""

    open fun getName(): String = "$firstName $lastName"
    abstract fun getAddress(): String
}

class Student: Person() {

    override fun getName(): String { return  "" }
    override fun getAddress(): String {
        val ud = UserData("Harish", 32)
        return ""
    }
}

data class UserData(val name: String, val age: Int)

