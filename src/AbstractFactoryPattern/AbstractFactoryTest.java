package AbstractFactoryPattern;

import AbstractFactoryPattern.shape.*;
import AbstractFactoryPattern.Color.Black;
import AbstractFactoryPattern.Color.ColorFactory;
import AbstractFactoryPattern.Color.Red;
import AbstractFactoryPattern.Color.White;
import AbstractFactoryPattern.size.Big;
import AbstractFactoryPattern.size.Size;
import AbstractFactoryPattern.size.SizeFactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        ColorFactory colorFactory = (ColorFactory) AbstractFactoryChose.choseFactory(ColorFactory.class);
        Red red = (Red) colorFactory.getColor(Red.class);
        White white = (White) colorFactory.getColor(White.class);
        Black black = (Black) colorFactory.getColor(Black.class);
        red.fill();
        white.fill();
        black.fill();

        ShapesFactory shapesFactory = (ShapesFactory) AbstractFactoryChose.choseFactory(ShapesFactory.class);
        Circle circle = (Circle) shapesFactory.getShape(Circle.class);
        Rectangle rectangle = (Rectangle) shapesFactory.getShape(Rectangle.class);
        circle.draw();
        rectangle.draw();

        SizeFactory sizeFactory = (SizeFactory) AbstractFactoryChose.choseFactory(SizeFactory.class);
        Big big = (Big) sizeFactory.getSize(Big.class);
        big.volume();
    }
}
