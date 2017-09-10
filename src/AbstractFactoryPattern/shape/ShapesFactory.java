package AbstractFactoryPattern.shape;

import AbstractFactoryPattern.AbstractFactory;

import AbstractFactoryPattern.ExceptionUtils;

public class ShapesFactory implements AbstractFactory{


    @Override
    public Object operations(Class clazz) {
        return ExceptionUtils.getObjByClazz(clazz);
    }


}
