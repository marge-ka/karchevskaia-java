package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    private  Calculator c;
    private final int a = 5;
    private final int b = 6;

    @BeforeEach
    public void setUp() {
        c = new Calculator(a, b);
    }

    @Test
    @DisplayName("Сумма двух чисел")
    public void testAdd() {
        assertEquals((a + b), c.add());
    }

    @Test
    @DisplayName("Вычитание второго числа из первого")
    public void testSubtract() {
        assertEquals((a - b), c.subtract());
    }

    @Test
    @DisplayName("Умножение двух чисел")
    public void testMultiply() {
        assertEquals((a * b), c.multiply());
    }

    @Test
    @DisplayName("Деление первого числа на второе")
    public void testDivide() throws DivisionByZeroException {
        assertEquals(String.format("%.2f", (double) a / (double) b), String.format("%.2f", c.divide()));
        assertEquals(((double) a / (double) b), c.divide());
    }

    @Test
    @DisplayName("Деление на ноль должно выбрасывать DivisionByZeroException")
    public void testDivideByZero() throws DivisionByZeroException {
        int zero = 0;
        c = new Calculator(a, zero);
        boolean exceptionThrown = false;

        try {
            c.divide();
        } catch (DivisionByZeroException e) {
            exceptionThrown = true;
            assertEquals("Деление на ноль недопустимо!", e.getMessage());
        }
        assertTrue(exceptionThrown, "Исключение не было выброшено");
    }
}
