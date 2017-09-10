package AbstractFactoryPattern;


public class ColorFactory implements AbstractFactory{
    @Override
    public Object getShape(Class<?extends Shape> clazz) {
        return null;
    }

    @Override
    public Object getColor(Class<?extends Color> clazz) {

        return ExceptionUtils.getObjByClazz(clazz);
    }
}
