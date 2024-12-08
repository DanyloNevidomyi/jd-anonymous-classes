package learning.java;

public class AnonymousShapeExample {
    public void demonstrateAnonymousClass() {
        // Анонімний клас для обчислення площі круга
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

        System.out.println(circle);
    }
}