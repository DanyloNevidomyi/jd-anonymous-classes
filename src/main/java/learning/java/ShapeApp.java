package learning.java;

public class ShapeApp {
    public static void main(String[] args) {
        // Демонстрація внутрішнього класу
        Rectangle rectangle = new Rectangle(4, 3);
        System.out.println(rectangle);

        // Демонстрація анонімного класу
        AnonymousShapeExample anonymousExample = new AnonymousShapeExample();
        anonymousExample.demonstrateAnonymousClass();
    }
}
