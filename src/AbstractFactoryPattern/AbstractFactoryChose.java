package AbstractFactoryPattern;

public class AbstractFactoryChose {

    public static Object choseFactory(Class<?extends AbstractFactory> clazz) {

        return ExceptionUtils.getObjByClazz(clazz);
    }
}
