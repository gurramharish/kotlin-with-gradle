package com.hans.signatory

data class User(val name: String, val id: Int, var isMarried: Boolean = false)

class Person(val name: String, var age: Int, var isMarried: Boolean = false) : Signatory {
    @JvmField
    var address = ""

    init {
        if(age < 22) throw Exception("Invalid age $age")
    }
    override fun sign() = println("Signing the documents as $name, age is $age")

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val person = Person("Harish", 31);
            person.sign()
            person.age = 32
            person.sign()
            println("Age of the person is ${person.age}")
            println("Name of the person is ${person.name}")
            val person2 = Person("Sai", 23, true)
            println("Person 2 is ${person2.isMarried}")
            val harish = User("Harish", 30)
            harish.isMarried = true;
            println(harish)
            val (name, id) = harish
            println("Name of the user is $name and their id is $id")
            val sai = harish.copy(id = 31)
            println(sai == harish)

        }
    }
}

