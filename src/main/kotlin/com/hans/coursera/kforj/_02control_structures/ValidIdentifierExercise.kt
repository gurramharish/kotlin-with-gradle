package com.hans.coursera.kforj._02control_structures

fun isValidIdentifier(s: String): Boolean {
    if(s.isEmpty() || s[0] in '0'..'9') return false
    fun isValidCharacter(ch: Char): Boolean = ch == '_' || ch in 'a'..'z' || ch in 'A'..'Z' || ch in '0'..'9'
    for(ch in s) {
        if(!isValidCharacter(ch)) return false
    }
    return true
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false

}