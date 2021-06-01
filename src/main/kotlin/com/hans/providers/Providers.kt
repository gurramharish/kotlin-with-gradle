package com.hans.providers

import java.security.Provider
import java.security.Security

class Providers {

    fun getProviders(): List<Provider> {
        println("Instance getProviders invoked!!")
        return Security.getProviders().asList();
    }

    companion object {
        fun getProviders(): List<Provider> {
            println("Static getProviders method invoked!!")
            return Security.getProviders().asList();
        }
    }
}