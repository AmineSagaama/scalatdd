package com.asagaama

import org.scalatest.{FeatureSpec, GivenWhenThen}

/**
  * Created by asagaama on 19/05/2017.
  */
class CalculatorSpec extends FeatureSpec with GivenWhenThen {


  info("As a calculator owner")
  info("I want to be able add two numbers")
  info("so I can get a correct result")
  feature("Addition") {
    scenario("User adds two numbers") {
      Given("a Calculator")
      val calc = new Calculator
      When("two numbers are added")
      val result = calc.add(2, 3)
      Then("we get correct result")
      assert(result == 5)

    }
  }

}
