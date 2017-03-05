package com.asagaama

import org.scalatest.FunSuite

/**
  * Created by asagaama on 05/03/2017.
  */
class HelloTest extends FunSuite {

  test("displaySalutation returns 'Hello World'") {
    assert(Hello.displaySalutation == "Hello World")
  }

}
