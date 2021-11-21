package com.hans.kotlin.fundametals._03_programming_with_types

interface Time {
    fun setTime(hours: Int, mins: Int = 0, secs: Int = 0)
    fun setTime(time: MyTime) = setTime(time.hours)
}

interface EndOfTheWorld {
    fun setTime(time: MyTime) {}
}

class MyTime {
    var hours = 0
    var mins = 0
    var secs = 0
}

class YetiTime : Time, EndOfTheWorld {
    // Explicitly mention override key word is must override a function
    override fun setTime(time: MyTime) {
        super<Time>.setTime(time)
        super<EndOfTheWorld>.setTime(time)
    }
    override fun setTime(hours: Int, mins: Int, secs: Int) {

    }
}

interface A {
    fun doSomething() {
        println("From A")
    }
}

interface B {
    fun doSomething() {
        println("From B")
    }
}

class C: A, B {

    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
    }
}

fun main() {
    val c = C()
    c.doSomething()
}