package com.hans.logger

import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import org.amshove.kluent.`should be`
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import java.io.File

class LoggerTest {

    @MockK
    lateinit var configuration: Configuration

    init {
        MockKAnnotations.init(this)
    }

    @Nested
    inner class `OnConstruction` {

        @Test
        fun `the log directoryName should be set`() {

            every { configuration[any()] } returns "logDirectoryName"
            val logger = Logger(configuration)
            assertEquals("logDirectoryName", logger.logDirectoryName)
        }
    }

    @Nested
    inner class GetMaxFileName {

        private val baseName = "baseName"

        init {
            every { configuration["logDirectory"] } returns "directory"
            every { configuration["logBaseName"] } returns baseName
        }

        @Test
        fun `should return 0 when there are no files`() {
            val logger = Logger(configuration)
            assertEquals(0, logger.getMaxFileNumber(listOf<File>(), ""))
        }

        @Test
        fun `should return 1 when there is one file`() {
            val logger = Logger(configuration)
            val logFileBaseName = baseName
            assertEquals(1, logger.getMaxFileNumber(listOf<File>(File("$baseName.log")), logFileBaseName))
        }

        @Test
        fun `should return 2 when there is a file with the suffix 1`() {
            val logFilesInDirectory = listOf(
                File("${baseName}.log"),
                File("${baseName}_1.log")
            )
            val logFileBaseName = baseName
            val logger = Logger(configuration)
            logger.getMaxFileNumber(logFilesInDirectory, logFileBaseName) `should be` 2
        }

        @Test
        fun `should return increment when there is are files with many suffixes`() {
            val logFilesInDirectory = listOf(
                File("${baseName}.log"),
                File("${baseName}_3.log"),
                File("${baseName}_5.log"),
                File("${baseName}_1.log")
            )
            val logFileBaseName = baseName
            val logger = Logger(configuration)
            logger.getMaxFileNumber(logFilesInDirectory, logFileBaseName) `should be` 6
        }
    }


    @Nested
    inner class AllFilesInDirectory {

        private val baseName = "baseName"

        init {
            every { configuration["logDirectory"] } returns "directory"
            every { configuration["logBaseName"] } returns baseName
        }

        @Test
        fun `should return 0 when there are no files`() {
            val logger = Logger(configuration)
            assertEquals(0, logger.getMaxFileNumber(listOf<File>(), ""))
        }
    }
}