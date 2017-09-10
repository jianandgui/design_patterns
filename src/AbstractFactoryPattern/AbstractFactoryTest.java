package AbstractFactoryPattern;

import FactoryPattern.ShapeFactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        ColorFactory colorFactory = (ColorFactory) AbstractFactoryChose.choseFactory(ColorFactory.class);
        Red red = (Red) colorFactory.getColor(Red.class);
        White white = (White) colorFactory.getColor(White.class);
        red.fill();
        white.fill();

        ShapesFactory shapesFactory = (ShapesFactory) AbstractFactoryChose.choseFactory(ShapesFactory.class);
        Circle circle = (Circle) shapesFactory.getShape(Circle.class);
        Rectangle rectangle = (Rectangle) shapesFactory.getShape(Rectangle.class);
        circle.draw();
        rectangle.draw();
    }
}
