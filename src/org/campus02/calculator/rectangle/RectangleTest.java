package org.campus02.calculator.rectangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Rect;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(2, 4);

    }

    @Test
    void calcScope() {
        int scope = rectangle.calcScope();
        int result = 12;
        Assertions.assertEquals(scope, result);
    }

    @Test
    void calcArea() {
    }
}