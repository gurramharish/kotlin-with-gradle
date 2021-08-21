package com.hans.coursera.kforj._03extensions

import java.lang.StringBuilder

fun String.lastChar() = get(this.length - 1)

fun String.repeat(n: Int): String {
    val sb = StringBuilder(n * length)
    for(i in 1..n) {
        sb.append(this)
    }
    return sb.toString()
}