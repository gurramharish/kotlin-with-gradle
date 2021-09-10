package com.hans.kotlin.fundametals._02_functions_in_kotlin

import java.math.BigInteger

tailrec fun fib(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) b else fib(n - 1, a + b, a)
}

fun main(){
    println(fib(100, BigInteger.ONE, BigInteger.ZERO))
}