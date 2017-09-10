package AbstractFactoryPattern.Adress;

import AbstractFactoryPattern.AbstractFactory;
import AbstractFactoryPattern.ExceptionUtils;

public class AddressFactory implements AbstractFactory {
    @Override
    public Object operations(Class clazz) {
        return ExceptionUtils.getObjByClazz(clazz);
    }
}
