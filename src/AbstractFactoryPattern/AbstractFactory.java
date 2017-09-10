package AbstractFactoryPattern;

import AbstractFactoryPattern.Color.Color;
import AbstractFactoryPattern.shape.Shape;
import AbstractFactoryPattern.size.Big;

public interface AbstractFactory {

    Object operations(Class clazz);
}
