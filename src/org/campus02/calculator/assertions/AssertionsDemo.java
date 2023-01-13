package org.campus02.calculator.assertions;

import org.junit.jupiter.api.*;

public class AssertionsDemo {
    // 1. Step - Setup
    int a;
    String s;

    @BeforeEach
    void setUp() {
        a = 1;
        s = "Hallo Welt";
        System.out.println("before each");

    }

    // 2. Step - Exercise

    @Test
    @DisplayName("Test assertEquals")
    void assertEqualsTest() {
        int actual = 1;

        // 3. Step - Verify
        Assertions.assertEquals(a, actual);
    }

    @Test
    void assertTrueTest() {
        String halloWelt = "Hallo Welt";

        Assertions.assertTrue(halloWelt.equals(s));
    }

    @Test
    void assertFalseTest() {
        Assertions.assertFalse(a < 0);
    }

    @Test
    void assertThrows() {
        int[] array = new int[1];

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
        int i = array[1];
        });

    }

    // 4. Step - Tear Down

    @AfterEach
    void tearDown() {
        System.out.println("after each");
    }
}
