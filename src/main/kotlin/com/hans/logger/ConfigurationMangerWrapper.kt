package com.hans.logger

interface Configuration {
    operator fun get(key: String): String
}

class MapConfiguration: Configuration {

    private val configurationManager = ConfigurationManager

    override fun get(key: String): String {
        return configurationManager[key]
    }

}