package org.athc.shell

import org.junit.jupiter.api.Test

class ShellApplicationTests {

  @Test
  fun simpleTest() {

    arrayListOf(1, 2, 3, 4, 5).forEach {
      when (it) {
        in 1..2 -> {
          println(it)
        }
        else -> {
          println("非法数据")
        }
      }
    }
  }
}
