package learning.java;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Внутрішній клас для розрахунків діагоналі
    public class DiagonalCalculator {
        public double calculateDiagonal() {
            return Math.sqrt(length * length + width * width);
        }
    }

    @Override
    public String toString() {
        DiagonalCalculator calculator = new DiagonalCalculator();
        return "Прямокутник [Довжина: " + length + ", Ширина: " + width +
                ", Площа: " + getArea() +
                ", Периметр: " + getPerimeter() +
                ", Діагональ: " + calculator.calculateDiagonal() + "]";
    }
}