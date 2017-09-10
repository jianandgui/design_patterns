package AbstractFactoryPattern;

public interface AbstractFactory {

    Object getShape(Class<?extends Shape> clazz);

    Object getColor(Class<?extends Color> clazz);
}
