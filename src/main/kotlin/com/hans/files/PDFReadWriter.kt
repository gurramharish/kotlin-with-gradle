package com.hans.files

import java.io.File
import java.io.FileOutputStream
import java.io.InputStream
import java.net.URI

fun readPdf(url: String): ByteArray {
    val inputS: InputStream = URI.create(url).toURL().openStream()
    return inputS.readBytes().also { println("Byte array :: ${it.size}") }
}

fun writePdf(bytes: ByteArray): Unit {
    var file = File.createTempFile("my_dummy", ".pdf")
    var os = FileOutputStream(file)
    os.write(bytes);
    os.close()
}

fun main(args: Array<String>) {
    writePdf(readPdf("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"))
}