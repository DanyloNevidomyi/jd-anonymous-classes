package learning.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void testAreaCalculation() {
        Rectangle rectangle = new Rectangle(4, 3);
        assertEquals(12.0, rectangle.getArea(), 0.001, "Площа обчислена невірно!");
    }

    @Test
    void testPerimeterCalculation() {
        Rectangle rectangle = new Rectangle(4, 3);
        assertEquals(14.0, rectangle.getPerimeter(), 0.001, "Периметр обчислений невірно!");
    }

    @Test
    void testDiagonalCalculation() {
        Rectangle rectangle = new Rectangle(4, 3);
        Rectangle.DiagonalCalculator calculator = rectangle.new DiagonalCalculator();
        assertEquals(5.0, calculator.calculateDiagonal(), 0.001, "Діагональ обчислена невірно!");
    }

    @Test
    void testToString() {
        Rectangle rectangle = new Rectangle(4, 3);
        String expected = "Прямокутник [Довжина: 4.0, Ширина: 3.0, Площа: 12.0, Периметр: 14.0, Діагональ: 5.0]";
        assertEquals(expected, rectangle.toString(), "Метод toString працює некоректно!");
    }

}