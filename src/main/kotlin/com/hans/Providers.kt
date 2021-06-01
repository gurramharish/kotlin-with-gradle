package com.hans

import java.security.Provider
import java.security.Security

fun getProviders(): List<Provider> {
    val providers = Security.getProviders()
    return providers.asList()
}

data class ProviderDetails(val providerName: String, val name: String)

fun getAllProviderDetails(filter: String): List<ProviderDetails> {
    val providers = getProviders()
    val allProviderDetails = mutableListOf<ProviderDetails>()
    return providers.flatMap { provider  ->  provider.entries
        .filter { it.key.toString().contains(filter, true) }
        .map { ProviderDetails(provider.name, it.key.toString()) }}
}