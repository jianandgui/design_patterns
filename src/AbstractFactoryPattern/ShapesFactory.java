package AbstractFactoryPattern;

import AbstractFactoryPattern.AbstractFactory;
import AbstractFactoryPattern.Color;
import AbstractFactoryPattern.Shape;

public class ShapesFactory implements AbstractFactory{
    @Override
    public Object getShape(Class<? extends Shape> clazz) {

        return ExceptionUtils.getObjByClazz(clazz);
    }

    @Override
    public Object getColor(Class<? extends Color> clazz) {
        return null;
    }
}
