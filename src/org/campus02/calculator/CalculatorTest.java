package org.campus02.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        int result = Calculator.add(2,2);
        // erwartetes Ergebnis
        int erwartet = 4;

        // Step 3: verify
        Assertions.assertEquals(erwartet, result);
    }

    @Test
    void subtract() {
        int result = Calculator.subtract(2, 2);
        // erwartetes Ergebnis
        int erwartet = 0;

        Assertions.assertEquals(erwartet, result);
    }

    @Test
    void mult() {
        int result = Calculator.mult(2,2);
        // erwartetes Ergebnis
        int erwartet = 4;

        Assertions.assertEquals(erwartet, result);
    }
}