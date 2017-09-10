package AbstractFactoryPattern.size;


import AbstractFactoryPattern.AbstractFactory;
import AbstractFactoryPattern.Color.Color;
import AbstractFactoryPattern.ExceptionUtils;
import AbstractFactoryPattern.shape.Shape;

public class SizeFactory implements AbstractFactory {
    @Override
    public Object getShape(Class<? extends Shape> clazz) {
        return null;
    }

    @Override
    public Object getColor(Class<? extends Color> clazz) {
        return null;
    }

    @Override
    public Object getSize(Class<Big> clazz) {
        return ExceptionUtils.getObjByClazz(clazz);
    }
}
