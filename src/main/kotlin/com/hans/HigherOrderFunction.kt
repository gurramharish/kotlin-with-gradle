package com.hans

import java.security.Provider

fun main(args: Array<String>) {
    val providers = getProviders()
    listAllProviders(providers) {
        key, value -> println("\t$key: $value")
    }

    val allProviderDetails = getAllProviderDetails("Random");
    allProviderDetails.forEach {println("${it.providerName}, ${it.name}")}
    allProviderDetails.forEach(::println)
}

fun listAllProviders(providers: List<Provider>, fn: (key: String, value: String) -> Unit) {
    providers.forEach { p ->  println(p.name)
        p.forEach {key, value -> fn(key.toString(), value.toString())}
    }
}