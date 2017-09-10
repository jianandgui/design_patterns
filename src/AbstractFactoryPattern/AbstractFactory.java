package AbstractFactoryPattern;

import AbstractFactoryPattern.Color.Color;
import AbstractFactoryPattern.shape.Shape;
import AbstractFactoryPattern.size.Big;

public interface AbstractFactory {

    Object getShape(Class<?extends Shape> clazz);

    Object getColor(Class<?extends Color> clazz);

    Object getSize(Class<Big> clazz);
}
