package com.example.api

import com.example.common.Resource

object Main extends App {
  val resource = Resource("foo")
  println("Serving resources....")
  Thread.sleep(3 * 1000)
  println("API terminated...")
}
