package AbstractFactoryPattern.Color;


import AbstractFactoryPattern.AbstractFactory;
import AbstractFactoryPattern.ExceptionUtils;
import AbstractFactoryPattern.shape.Shape;
import AbstractFactoryPattern.size.Big;

public class ColorFactory implements AbstractFactory {
    @Override
    public Object getShape(Class<?extends Shape> clazz) {
        return null;
    }

    @Override
    public Object getColor(Class<?extends Color> clazz) {

        return ExceptionUtils.getObjByClazz(clazz);
    }

    @Override
    public Object getSize(Class<Big> clazz) {
        return null;
    }
}
