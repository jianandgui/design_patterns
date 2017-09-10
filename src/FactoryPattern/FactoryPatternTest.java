package FactoryPattern;

public class FactoryPatternTest {



    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.createShape("Square");
        shape.draw();

        Shape shape1 = factory.createShape("Rectangle");
        shape1.draw();

    }
}
