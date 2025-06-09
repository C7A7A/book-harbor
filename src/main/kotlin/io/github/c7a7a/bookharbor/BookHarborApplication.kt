package io.github.c7a7a.bookharbor

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookHarborApplication

fun main(args: Array<String>) {
    runApplication<BookHarborApplication>(*args)
}