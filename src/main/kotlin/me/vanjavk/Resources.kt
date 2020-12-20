/*
 * Copyright (c) 2018 by Todd Ginsberg
 */

package me.vanjavk

import java.io.File

internal object Resources {
    fun resourceAsRawString(fileName: String, delimiter: String = ""): String =
        File(Resources.javaClass.classLoader.getResource(fileName).toURI())
            .readText()

    fun resourceAsString(fileName: String, delimiter: String = ""): String =
            File(Resources.javaClass.classLoader.getResource(fileName).toURI())
                    .readLines()
                    .reduce { a, b -> "$a$delimiter$b" }

    fun resourceAsList(fileName: String): List<String> =
            File(Resources.javaClass.classLoader.getResource(fileName).toURI())
                    .readLines()
}

