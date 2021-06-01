package com.hans.calculate

import org.junit.jupiter.api.Assertions
import org.mockito.kotlin.mock
import org.mockito.kotlin.verify
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature
import org.spekframework.spek2.style.specification.describe

class CalculatorSpek : Spek({
    var calculator: Calculator? = null
    beforeEachGroup {
        calculator = Calculator(NullResultWriter())
    }
      Feature("Calculator") {
          Scenario("adding two positive numbers") {
              var result: Int = 0
              When("adding 20 and 30") {
                  result = calculator?.add(20, 30)!!
              }
              Then("result should be 50") {
                  Assertions.assertEquals(50, result)
              }

              Then("Just assert true") {
                  Assertions.assertTrue(true)
              }
          }

          Scenario("Accumulate") {
              Given("Given 5 to accumulate") {
                  calculator?.accumulate(5)
              }
              Then("Total should be 5") {
                  Assertions.assertEquals(5, calculator?.total)
              }
          }
      }
    describe("Write accumulate total to output") {
        val resultWriter: ResultWriter = mock()
        val calculator = Calculator(resultWriter)
        it("Accumulate") {
            calculator.accumulate(20)
            verify(resultWriter).write(20)
        }
    }
})