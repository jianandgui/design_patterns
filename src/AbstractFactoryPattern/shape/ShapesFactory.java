package AbstractFactoryPattern.shape;

import AbstractFactoryPattern.AbstractFactory;
import AbstractFactoryPattern.ExceptionUtils;
import AbstractFactoryPattern.Color.Color;
import AbstractFactoryPattern.size.Big;

public class ShapesFactory implements AbstractFactory{
    @Override
    public Object getShape(Class<? extends Shape> clazz) {

        return ExceptionUtils.getObjByClazz(clazz);
    }

    @Override
    public Object getColor(Class<? extends Color> clazz) {
        return null;
    }

    @Override
    public Object getSize(Class<Big> clazz) {
        return null;
    }
}
