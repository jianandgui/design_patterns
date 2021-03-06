package AbstractFactoryPattern.size;


import AbstractFactoryPattern.AbstractFactory;
import AbstractFactoryPattern.ExceptionUtils;

public class SizeFactory implements AbstractFactory {

    @Override
    public Object operations(Class clazz) {
        return ExceptionUtils.getObjByClazz(clazz);
    }

}
