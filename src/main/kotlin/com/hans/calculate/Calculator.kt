package com.hans.calculate

class Calculator(val writer: ResultWriter) {

    var total = 0
    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun accumulate(x: Int) {
        total += x
        writer.write(total)
    }
}

interface ResultWriter {
    fun write(answer: Int)
}

class NullResultWriter: ResultWriter {
    override fun write(answer: Int) {

    }
}