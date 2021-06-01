package com.hans

import com.hans.providers.Providers
import com.hans.signatory.Person

fun main(args: Array<String>) {
    val providers = Providers.getProviders()
    providers.forEach {p -> println(p.name)}
    val it = providers.iterator()
    while (it.hasNext()) {
        val provider = it.next()
        println(provider.name)
        provider.forEach {key, value -> println("\t$key: $value")}
    }
    println("-------------------------------------------------------")
    val ps = Providers()
    ps.getProviders().forEach {p ->
        println("Provider Name is : ${p.name}")
        p.forEach { key, value -> println("\t$key: $value")}
    }
    println("#######################################################")
    val person = Person("Harish", 22);
    person.sign()

    println("******************************************************")
    // function call from another kotlin file
    val providers2 = getProviders();
    providers2.forEach {p -> println(p.name)}
}