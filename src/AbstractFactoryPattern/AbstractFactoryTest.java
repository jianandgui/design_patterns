package AbstractFactoryPattern;

import AbstractFactoryPattern.Adress.AddressFactory;
import AbstractFactoryPattern.Adress.ChengDu;
import AbstractFactoryPattern.shape.*;
import AbstractFactoryPattern.Color.Black;
import AbstractFactoryPattern.Color.ColorFactory;
import AbstractFactoryPattern.Color.Red;
import AbstractFactoryPattern.Color.White;
import AbstractFactoryPattern.size.Big;
import AbstractFactoryPattern.size.SizeFactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        ColorFactory colorFactory = (ColorFactory) AbstractFactoryChose.choseFactory(ColorFactory.class);
        Red red = (Red) colorFactory.operations(Red.class);
        White white = (White) colorFactory.operations(White.class);
        Black black = (Black) colorFactory.operations(Black.class);
        red.fill();
        white.fill();
        black.fill();

        ShapesFactory shapesFactory = (ShapesFactory) AbstractFactoryChose.choseFactory(ShapesFactory.class);
        Circle circle = (Circle) shapesFactory.operations(Circle.class);
        Rectangle rectangle = (Rectangle) shapesFactory.operations(Rectangle.class);
        circle.draw();
        rectangle.draw();

        SizeFactory sizeFactory = (SizeFactory) AbstractFactoryChose.choseFactory(SizeFactory.class);
        Big big = (Big) sizeFactory.operations(Big.class);
        big.volume();

        AddressFactory addressFactory = (AddressFactory) AbstractFactoryChose.choseFactory(AddressFactory.class);
        ChengDu address = (ChengDu) addressFactory.operations(ChengDu.class);
        address.isLocation();

    }
}
