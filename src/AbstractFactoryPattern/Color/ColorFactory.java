package AbstractFactoryPattern.Color;


import AbstractFactoryPattern.AbstractFactory;
import AbstractFactoryPattern.ExceptionUtils;
import AbstractFactoryPattern.shape.Shape;
import AbstractFactoryPattern.size.Big;

public class ColorFactory implements AbstractFactory {

    @Override
    public Object operations(Class clazz) {
        return ExceptionUtils.getObjByClazz(clazz);
    }
}
