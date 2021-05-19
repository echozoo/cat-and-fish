package org.athc.shell

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ShellApplication

fun main(args: Array<String>) {
  SpringApplication.run(ShellApplication::class.java, *args)
}
