package com.hans.calculate

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CalculatorTest {

    @Test
    fun `1 + 1 =2`() {
        val calculator = Calculator(NullResultWriter())
        Assertions.assertEquals(2, calculator.add(1, 1), "1 + 1 should equal to 2")
    }
}