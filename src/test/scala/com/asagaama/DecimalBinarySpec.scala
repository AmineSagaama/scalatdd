package com.asagaama

import org.scalatest.FlatSpec

/**
  * Created by Amine Sagaama on 27/03/2017.
  */
class DecimalBinarySpec extends FlatSpec {

  "base conversion utility" should "convert a number 99 into a binary number 1100011" in {
    var binary: Binary = BaseConversion decimalToBinary Decimal("99")
    assert(binary.number == "1100011")
  }

}
