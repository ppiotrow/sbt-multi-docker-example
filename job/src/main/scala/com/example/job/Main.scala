package com.example.job

import com.example.common.Resource

object Main extends App{

  print("Creating resources......")
  Thread.sleep(3*1000)
  val newResources = Seq(Resource("1"), Resource("2"))
  print("Job finished.")
}
