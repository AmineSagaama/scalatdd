package com.asagaama

import org.scalatest.FlatSpec

/**
  * Created by asagaama on 19/05/2017.
  */
class AddSpec extends FlatSpec {

  "Addition of 3 and 3" should "have result 6" in {
    assert((3 + 3) == 6)
  }

}
