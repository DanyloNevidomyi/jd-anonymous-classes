package learning.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnonymousShapeExampleTest {
    @Test
    void testAnonymousCircle() {
        Shape circle = new Shape() {
            private double radius = 5;

            @Override
            public double getArea() {
                return Math.PI * radius * radius;
            }

            @Override
            public double getPerimeter() {
                return 2 * Math.PI * radius;
            }

            @Override
            public String toString() {
                return "Коло [Радіус: " + radius +
                        ", Площа: " + getArea() +
                        ", Периметр: " + getPerimeter() + "]";
            }
        };

        assertEquals(78.53981633974483, circle.getArea(), 0.001, "Площа круга обчислена невірно!");
        assertEquals(31.41592653589793, circle.getPerimeter(), 0.001, "Периметр круга обчислений невірно!");
        String expected = "Коло [Радіус: 5.0, Площа: 78.53981633974483, Периметр: 31.41592653589793]";
        assertEquals(expected, circle.toString(), "Метод toString для анонімного класу працює некоректно!");
    }

}